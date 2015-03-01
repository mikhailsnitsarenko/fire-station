package entity;

public class Transport {

    private Human human;
    private String title;
    private int number;

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "human=" + human +
                ", title='" + title + '\'' +
                ", number=" + number +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Transport transport = (Transport) o;

        if (number != transport.number) return false;
        if (human != null ? !human.equals(transport.human) : transport.human != null) return false;
        if (title != null ? !title.equals(transport.title) : transport.title != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = human != null ? human.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + number;
        return result;
    }
}
