
package za.ac.tut.membership;


public class Member {
    private String name;
    private String surname;
    private String idNo;
    private String gender;
    private String contractType;
    private Boolean isPersonalTrainerNeeded;

    public Member(String name, String surname, String idNo, String gender, String contractType, Boolean isPersonalTrainerNeeded) {
        this.name = name;
        this.surname = surname;
        this.idNo = idNo;
        this.gender = gender;
        this.contractType = contractType;
        this.isPersonalTrainerNeeded = isPersonalTrainerNeeded;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public void setIsPersonalTrainerNeeded(Boolean isPersonalTrainerNeeded) {
        this.isPersonalTrainerNeeded = isPersonalTrainerNeeded;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getIdNo() {
        return idNo;
    }

    public String getGender() {
        return gender;
    }

    public String getContractType() {
        return contractType;
    }

    public Boolean getIsPersonalTrainerNeeded() {
        return isPersonalTrainerNeeded;
    }
    
    
}
