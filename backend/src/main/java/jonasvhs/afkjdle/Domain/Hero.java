package jonasvhs.afkjdle.Domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter @Setter
public class Hero {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "hero_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "rarity")
    private String rarity;

    @Column(name = "faction")
    private String faction;

    @Column(name = "type")
    private String type;

    @Column(name = "image_url")
    private String image;

    @OneToMany
    @Column(name = "abilities")
    private List<Ability> abilities;

    public Hero() {}
}
