public enum Shapes {
        STONE("stone"),
        PAPER("paper"),
        SCISSORS("scissors");

        private final String text;

        private Shapes(String text) {
            this.text = text;
        }

        public String getText() {
            return this.text;
        }
    }


