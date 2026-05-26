package plataform;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class User {

    // Atributos

        private String name;
        private String email;
        private String password;
        private String country;
        private int age;
        private LocalDateTime registrationDate;

    // Constructor

        public User(String name, String email){
            this.name = name;
            this.email = email;
            this.registrationDate = LocalDateTime.now();
        }
        public User(String name, String email, String password, String country, int age, LocalDateTime registrationDate) {
            this.name = name;
            this.email = email;
            this.password = password;
            this.country = country;
            this.age = age;
            this.registrationDate = registrationDate;
        }

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    // To String

        @Override
        public String toString() {
            return "Users{" +
                    "name='" + name + '\'' +
                    ", email='" + email + '\'' +
                    ", password='" + password + '\'' +
                    ", country='" + country + '\'' +
                    ", age=" + age +
                    ", registration date=" + registrationDate +
                    '}';
        }


}

