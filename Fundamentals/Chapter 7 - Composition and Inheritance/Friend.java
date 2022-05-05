public class Friend 
{ // Objects represent my friends

    protected String name;  // e.g., "Bill Ross"
    protected String telephone;  // e.g., "283-9104"
    protected Friend next;  // next object in list
    static Friend list;     // linked list of friends

    static void print()
    {
        Friend friend = list;
        if (friend == null) System.out.println("The list is empty.");
        else do
        {
            System.out.println(friend);
            friend = friend.next;
        } while (friend!= null);
    }

    Friend(String name, String telephone)
    {
        this.name = name;
        this.telephone = telephone;
        this.next = list;
        list = this;
    }

    public String toString()
    {
        return new String(name + ":\t" + telephone);

    }
    
}

class TestFriend
{ // Test driver for the Friend class:
    public static void main(String[] args) 
    {
        Friend.print();
        new Friend("Martin Ryle", "388-1095");
        new Friend("Bill Ross", "283-9104");
        new Friend("Nat Withers", "217-5912");
        Friend.print();

    }

}
