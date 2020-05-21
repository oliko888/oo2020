public class EstonianID implements PersonalCodeBehaviour {
    public String gender;
    public String id_code = "39303220000";

    @Override
    public String getGender() {
        int genderNumber = Integer.parseInt(this.id_code.substring(0,1));
        if (genderNumber == 4) {
            gender = "female";
        } else {
            gender = "male";
        }   
        return gender;
    }

    @Override
    public String getBirthday() {
        String age = this.getYear() + "." + this.getMonth() + "." + this.getDay();
        
        return age;
    }

    @Override
    public String getYear() {
        int year = Integer.parseInt(this.id_code.substring(1, 3));
        String fullYear = "";
        if (year > 20) {
            fullYear = "19" + year;
        } else {
            fullYear = "20" + year;
        }

        return fullYear;
    }

    @Override
    public int getDay() {
        int day = Integer.parseInt(this.id_code.substring(5, 7));
        
        return day;
    }

    @Override
    public int getMonth() {
        int month = Integer.parseInt(this.id_code.substring(3, 5));

        return month;
    }

    @Override
    public String getAge() {
        String age = this.getYear() + this.getMonth() + this.getDay();

        return age;
    }
    
}