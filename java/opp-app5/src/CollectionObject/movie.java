package CollectionObject;

/**
 * Description:
 *
 * @Author KC萧寒
 * Date: 2022-02-10
 * Time: 14:08
 */
public class movie {
    private String name;
    private double score;
    private  String actor;

    public movie() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public movie(String name, double score, String actor) {
        this.name = name;
        this.score = score;
        this.actor = actor;
    }
    @Override
    public String toString() {
        return "movie{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", actor='" + actor + '\'' +
                '}';
    }
}
