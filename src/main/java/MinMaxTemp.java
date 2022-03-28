import java.util.Objects;

public class MinMaxTemp {

    private String minTemp;
    private String maxTemp;

    public String getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(String minTemp) {
        this.minTemp = minTemp;
    }

    public String getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(String maxTemp) {
        this.maxTemp = maxTemp;
    }

    public MinMaxTemp(String minTemp, String maxTemp) {
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
    }

    @Override
    public String toString() {
        return "MinMaxTemp{" +
                "minTemp=" + minTemp +
                ", maxTemp=" + maxTemp +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MinMaxTemp that = (MinMaxTemp) o;
        return Objects.equals(minTemp, that.minTemp) && Objects.equals(maxTemp, that.maxTemp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(minTemp, maxTemp);
    }
}
