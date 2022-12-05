public class KidUser extends LibraryUser{
    private int age;
    private String bookType;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getBookType() {
        return bookType;
    }
    public void setBookType(String bookType) {
        this.bookType = bookType;
    }
    @Override
    public void registerAccount() {
        if (this.age<=11) {
            System.out.println("You are " + age + " years old. You have successfully registered under a Kids Account");
        }else{
            System.out.println("You are " + age + " years old. Sorry, Age must be less than 12 to register as a kid");
        }
    }

    @Override
    public void requestBook() {
        if (bookType == "Kids"){
            System.out.println("You requested " + bookType + " type of book. Book Issued successfully, please return the book within 10 days");
        }else {
            System.out.println("You requested " + bookType + " type of book. Oops, you are allowed to take only kids books");
        }
    }
}
