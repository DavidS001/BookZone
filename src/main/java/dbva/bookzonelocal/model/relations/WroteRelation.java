package dbva.bookzonelocal.model.relations;

import dbva.bookzonelocal.model.primarykeys.WroteID;
import lombok.Data;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "napisal", schema = "project")
public class WroteRelation {

    @EmbeddedId
    private WroteID wroteID;

    public WroteRelation(WroteID wroteID) {
        this.wroteID = wroteID;
    }

    public WroteRelation() {
    }
}
