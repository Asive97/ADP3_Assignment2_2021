package za.ac.cput.ADP3_Assignment2_2021;
/*
 * Asive Madladla 217068332
 */

public class List {
        private String id;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "List{" +
                    "id='" + id + '\'' +
                    '}';
        }

        public List(String id) {
            this.id = id;
        }
    }

