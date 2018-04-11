import java.util.ArrayList;

/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Club
{
    // Define any necessary fields here ...
    private ArrayList<Membership> memberList;
    
    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        // Initialise any fields here ...
        memberList = new ArrayList<Membership>();
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership member)
    {
        memberList.add(member);
    }

    public int joinedInMonth (int month){
        int i = 0;
        if(month>=1 && month <=12){
            for(Membership member:memberList){
                if(member.getMonth()==month){
                    i++;
                }
            }
        }else{
            System.out.println("这不是有效的月份参数");
            return 0;
        }
        return i;
    }
    
    public ArrayList<Membership> purge(int month,int year){
        ArrayList<Membership> memberDelete = new ArrayList<Membership>();
        for(int i = 0 ;i < memberList.size();i++){
            if(memberList.get(i).getMonth()==month && memberList.get(i).getYear()==year){
                memberDelete.add(memberList.remove(i));
                i--;
            } 
        }
        return memberDelete;
    }
    
    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        return memberList.size();
    }
    public void creatMember(){
        join(new Membership("wzq",12,2009));
        join(new Membership("lidudu",11,2009));
        join(new Membership("test1",10,2009));
        join(new Membership("wzq",9,2009));
    }
}
