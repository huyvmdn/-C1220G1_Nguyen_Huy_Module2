package FuramaResort.Models;

public class Customer {
    private String name;
    private String birthday;
    private String gender;
    private int identityCard;
    private int phoneNumber;
    private String email;
    private String TypeOfGuests;
    private String adress;
    private Services usingService;

    public Customer(String name, String birthday, String gender, int identityCard, int phoneNumber, String email, String typeOfGuests, String adress, Services usingService) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.identityCard = identityCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        TypeOfGuests = typeOfGuests;
        this.adress = adress;
        this.usingService = usingService;
    }

    public Customer(String name, String birthday, String gender, int identityCard, int phoneNumber, String email, String typeOfGuests, String adress) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.identityCard = identityCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        TypeOfGuests = typeOfGuests;
        this.adress = adress;
    }

    public Customer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(int identityCard) {
        this.identityCard = identityCard;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTypeOfGuests() {
        return TypeOfGuests;
    }

    public void setTypeOfGuests(String typeOfGuests) {
        TypeOfGuests = typeOfGuests;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Services getUsingService() {
        return usingService;
    }

    public void setUsingService(Services usingService) {
        this.usingService = usingService;
    }
    public int getYearCustomer() {
        String[] arrayString =this.birthday.split("/");
        return Integer.parseInt(arrayString[2]);
    }

    @Override
    public String toString() {
        return name + ',' +
                birthday + ',' +
                gender + ',' +
                identityCard + ',' +
                phoneNumber + ',' +
                email + ',' +
               TypeOfGuests + ',' +
              adress + ',' +
                usingService ;
    }

    public void showInfo() {
        System.out.println("Customer{" +
                "name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", gender='" + gender + '\'' +
                ", identityCard=" + identityCard +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", TypeOfGuests='" + TypeOfGuests + '\'' +
                ", andress='" + adress + '\'' +
//                ", usingService=" + usingService.showInfor() +
                '}');
    }
}
