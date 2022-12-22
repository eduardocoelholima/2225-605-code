package interfaces;

public interface Mythical {
    default String identifyMyself() {
        return "I am a mythical creature.";
    }
}

