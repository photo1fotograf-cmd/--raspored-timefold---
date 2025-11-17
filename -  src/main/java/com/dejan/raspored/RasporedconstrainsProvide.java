import ai.timefold.solver.core.api.score.stream.*;

public class RasporedConstraintProvider implements ConstraintProvider {
    @Override
    public Constraint[] defineConstraints(ConstraintFactory factory) {
        return new Constraint[] {
            nastavnikNeMozeDvaUIstomTerminu(factory)
        };
    }

    private Constraint nastavnikNeMozeDvaUIstomTerminu(ConstraintFactory factory) {
        return factory
            .from(Lesson.class)
            .join(Lesson.class,
                Joiners.equal(Lesson::getTimeslot),
                Joiners.equal(Lesson::getNastavnik))
            .filter((l1, l2) -> !l1.equals(l2))
            .penalize("Nastavnik u istom terminu", HardSoftScore.ONE_HARD);
    }
}
