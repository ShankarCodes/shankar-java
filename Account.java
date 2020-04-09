import java.math.BigInteger;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

class Account
{
    private final String DATE_FORMAT = "dd-mm-yyyy";
    private String accno = null;
    private String name = null;
    private String address = null;
    private Date dob = null;
    private String mobno = null;
    private String email = null;
    private String password = null;
    private boolean isValidData = false;
    private boolean first_accno = true;
    Date getDate(String dob) throws ParseException
    {

        DateFormat format = new SimpleDateFormat(DATE_FORMAT, Locale.ENGLISH);
        Date date = format.parse(dob);
        return date; 
    }

    boolean isValidAge(String dateBirth) throws ParseException
    {
        long diffInMillies = Math.abs(getDate(dateBirth).getTime() - new Date().getTime());
        double diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS)/365.0;
        return diff>=18;
    } 

    public void setAccountNumber(BigInteger last_acc)
    {
        this.isValidData = false;
        if(this.first_accno)
        {
            this.accno = last_acc.add(BigInteger.valueOf(1)).toString();
            this.first_accno = false;
        }
    }

    public void setName(String name)
    {
        this.isValidData = false;
        this.name = name;
    }

    public void setAddress(String address)
    {
        this.isValidData = false;
        this.address = address;
    }

    public void setDateOfBirth(String db) throws ParseException
    {
        this.isValidData = false;
        this.dob = getDate(db);
    }

    public void setMobileNumber(String mobno)
    {
        this.isValidData = false;
        this.mobno = mobno;
    }

    public void setEmail(String email)
    {
        this.isValidData = false;
        this.email = email;
    }

    public void setPassword(String oldPassword,String newPassword, String confirmPassword)
    {
        if(this.password == oldPassword)
        {
            if(newPassword == confirmPassword)
            {
                this.password = password;
                this.isValidData = false;
            }
            else
            {
                System.out.println("Entered passwords do not match");
            }
        }
        else
        {
            System.out.println("Incorrect Old Password");
        }
    }

    public void isValid()
    {
        if(password != null && email !=null && name!= null && mobno!= null && accno != null && dob!=null && address!=null)
        {
           
           
                this.isValidData = true;
            
        }
    }
}