

import java.util.*;
/**
 * TicketMachine models a ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * Instances will check to ensure that a user only enters
 * sensible amounts of money, and will only print a ticket
 * if enough money has been input.
 * 
 * @author David J. Barnes and Michael Kolling
 * @version 2006.03.30
 */
public class TicketMachine
{
    // The price of a ticket from this machine.
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;
    
    private int maxTicketsNum;
    
    private List<Ticket> tickets;
    
    private int ticketsIndex;

    /**
     * Create a machine that issues tickets of the given price.
     */
    public TicketMachine(int maxTicketsNum)
    {
        if(maxTicketsNum>0){
            tickets = new ArrayList<Ticket> (maxTicketsNum);
            ticketsIndex = 0;
            balance = 0;
            price = 0;
            total = 0;
            this.maxTicketsNum = maxTicketsNum;
        }else{
            System.out.println("创建失败，请输入大于1的车票种类");
        }
        
    }
    
    public void createTicket(Ticket tk)
    {
       if(tickets.size()==maxTicketsNum){
           System.out.println("车票类型已满，无法添加");
       }else{
           tickets.add(tk);
       }
    }

    public void setticketsPriceIndex(int index){
        if(index<maxTicketsNum){
            ticketsIndex = index;
        }else{
            System.out.println("无法切换到该车票");
        }
        
    }
    
    /**
     * @Return The price of a ticket.
     */
    public int getPrice()
    {
        return tickets.get(ticketsIndex).getPrice();
    }

    /**
     * Return The amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }

    /**
     * Receive an amount of money in cents from a customer.
     * Check that the amount is sensible.
     */
    public void insertMoney(int amount)
    {
        if(amount >= 0) {
            balance = balance + amount;
        }
        else {
            System.out.println("Use a positive amount: " +
                               amount);
        }
    }

    /**
     * Print a ticket if enough money has been inserted, and
     * reduce the current balance by the ticket price. Print
     * an error message if more money is required.
     */
    public void printTicket()
    {
        int amountLeftToPay;
        amountLeftToPay = tickets.get(ticketsIndex).getPrice() - balance;
        if(amountLeftToPay <= 0) {
            // Simulate the printing of a ticket            
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket");
            System.out.println("# " + tickets.get(ticketsIndex).getPrice() + " cents.");
            System.out.println("##################");
            System.out.println();

            // Update the total collected with the price.
            total = total + tickets.get(ticketsIndex).getPrice();
            // Reduce the balance by the prince.
            balance = balance - tickets.get(ticketsIndex).getPrice();
        }
        else {
            System.out.println("You must insert at least: " +
                               (amountLeftToPay) + " more cents.");
                    
        }
    }

    /**
     * Return the money in the balance.
     * The balance is cleared.
     */
    public int refundBalance()
    {
        int amountToRefund;
        amountToRefund = balance;
        balance = 0;
        return amountToRefund;
    }
    
    public int emptyMachine(){
        int result = total;
        total = 0;
        return result;
    }
}
