public class Person {
    public String cName,eName,department,email,phone,address,id;
    public short sex;
    public int height,weight;
    public Person(String cName1,String eName1,String department1,String email1,String phone1,String address1,String id1,short sex1,int height1,int weight1){
        this.setcName(cName1);
        this.seteName(eName1);
        this.setDepartment(department1);
        this.setEmail(email1);
        this.setPhone(phone1);
        this.setAddress(address1);
        this.setId(id1);
        this.setSex(sex1);
        this.setHeight(height1);
        this.setHeight(height1);
    }
    public void setcName(String cName1){
        if (cName1.length()<30){
            this.cName=cName1;
        }else {
            System.out.println("中文姓名超過30");
            this.cName=cName1.substring(0,30);
        }
    }
    public String getcName() {
        return cName;
    }
    public void seteName(String eName1) {
        if (eName1.length()<30){
            this.eName=eName1;
        }else {
            System.out.println("英文姓名超過30");
            this.eName=eName1.substring(0,30);
        }
    }
    public String geteName() {
        return eName;
    }
    public void setDepartment(String department1) {
        this.department = department1;
    }
    public String getDepartment() {
        return department;
    }
    public void setEmail(String email1) {
        this.email = email1;
    }
    public String getEmail() {
        return email;
    }
    public void setPhone(String phone1) {
        if (phone1.matches("[0-9]{10}")){
            this.phone=phone1;
        }else {
            System.out.println("號碼格式錯誤");
            this.phone="error";
        }
    }
    public String getPhone() {
        return phone;
    }
    public void setAddress(String address1) {
        this.address = address1;
    }
    public String getAddress() {
        return address;
    }
    public void setId(String id1) {
        if (id1.matches("[0-9]{9}")){
            this.id = id1;
        }else {
            System.out.println("id格式錯誤");
            this.id="error";
        }
    }
    public String getId() {
        return id;
    }
    public void setSex(short sex1) {
        if (sex1>=0 && sex1<3){
            this.sex=sex1;
        }else {
            System.out.println("性別有誤");
            this.sex=999;
        }
    }
    public short getSex() {
        return sex;
    }
    public void setHeight(int height1) {
        if (height1>10 && height1<250){
            this.height=height1;
        }else {
            System.out.println("身高錯誤");
            this.height=999;
        }
    }
    public int getHeight() {
        return height;
    }
    public void setWeight(int weight1) {
        if (weight1>30 && weight1<350){
            this.weight=weight1;
        }else {
            System.out.println("體重錯誤");
            this.weight=999;
        }
    }
    public int getWeight() {
        return weight;
    }
}
