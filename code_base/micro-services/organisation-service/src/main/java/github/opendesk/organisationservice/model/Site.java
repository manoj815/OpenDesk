
package github.opendesk.organisationservice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Site {
    private String siteId;
    private String name;
    private List<Floor> floors;
    @JsonIgnore
    private String orgId;
}
