package tpws.wsproject.Entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "counters")
public class Counters {

    @Id
    private String id;

    private int seq_value;

    public Counters() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSeq_value() {
        return seq_value;
    }

    public void setSeq_value(int seq_value) {
        this.seq_value = seq_value;
    }
}