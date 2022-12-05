public class AdultUser extends LibraryUser {
    private int age;
    private String bookType;

    public int getAge() {
        return age;
    }

    public String getBookType() {
        return bookType;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    @Override
    public void registerAccount() {
        if (age >= 12) {
            System.out.println("You are " + age + " years old. You have successfully registered under an Adult Account");
        }else {
            System.out.println("You are " + age + " years old. Sorry, Age must be greater than 12 to register as an adult");
        }
    }

    @Override
    public void requestBook() {
        if (bookType == "Fiction") {
            System.out.println("You requested " + bookType + " type of book. Book Issued successfully, please return the book within 7 days");
        }else {
            System.out.println("You requested " + bookType + " type of book. Oops, you are allowed to take only adult Fiction books");
        }
    }
}
