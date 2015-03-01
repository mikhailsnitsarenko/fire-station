package entity;

public abstract class BaseEntity {

    protected int badgeId;

    public int getBadgeId() {
        return badgeId;
    }

    public void setBadgeId(int badgeId) {
        this.badgeId = badgeId;
    }

    @Override
    public String toString() {
        return "BaseEntity{" +
                "badgeId=" + badgeId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BaseEntity that = (BaseEntity) o;

        if (badgeId != that.badgeId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return badgeId;
    }
}
