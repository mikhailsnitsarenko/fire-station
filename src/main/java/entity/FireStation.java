package entity;

public class FireStation {

    private Human human;
    private Transport transport;

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    @Override
    public String toString() {
        return "FireStation{" +
                "human=" + human +
                ", transport=" + transport +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FireStation that = (FireStation) o;

        if (human != null ? !human.equals(that.human) : that.human != null) return false;
        if (transport != null ? !transport.equals(that.transport) : that.transport != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = human != null ? human.hashCode() : 0;
        result = 31 * result + (transport != null ? transport.hashCode() : 0);
        return result;
    }
}
