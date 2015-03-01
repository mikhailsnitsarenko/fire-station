package entity;

import java.time.LocalDate;

public class Human extends BaseEntity {

    private String name;
    private String surname;
    private LocalDate dateBirthday;
    private String experience;
    private Role role;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getDateBirthday() {
        return dateBirthday;
    }

    public void setDateBirthday(LocalDate dateBirthday) {
        this.dateBirthday = dateBirthday;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateBirthday=" + dateBirthday +
                ", experience='" + experience + '\'' +
                ", role=" + role +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Human human = (Human) o;

        if (dateBirthday != null ? !dateBirthday.equals(human.dateBirthday) : human.dateBirthday != null) return false;
        if (experience != null ? !experience.equals(human.experience) : human.experience != null) return false;
        if (name != null ? !name.equals(human.name) : human.name != null) return false;
        if (role != human.role) return false;
        if (surname != null ? !surname.equals(human.surname) : human.surname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (dateBirthday != null ? dateBirthday.hashCode() : 0);
        result = 31 * result + (experience != null ? experience.hashCode() : 0);
        result = 31 * result + (role != null ? role.hashCode() : 0);
        return result;
    }
}
