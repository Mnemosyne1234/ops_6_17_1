package opsmiso.domain;

import java.util.*;
import lombok.*;
import opsmiso.domain.*;
import opsmiso.infra.AbstractEvent;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
}
