package jonasvhs.afkjdle.Domain;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OrderColumn;

import java.time.LocalDate;
import java.util.List;

@Entity
public class AnswerBag {

    @Id
    private int id;

    @ElementCollection
    @OrderColumn
    private List<Long> remainingAbilityIds;

    @ElementCollection
    private List<Long> usedAbilityIds;

    private LocalDate lastRefillDate;
}
