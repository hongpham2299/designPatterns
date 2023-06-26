package builderPattern;

import builderPattern.model.Address;
import builderPattern.model.User;
import builderPattern.builder.UserDTO;
import builderPattern.builder.UserDTOBuilder;

import java.time.LocalDate;

//This is our director class
public class Director {

    //This method serves the role of director in builder pattern
    public UserDTO directBuild(UserDTOBuilder builder, User user){
        UserDTO userDTO = builder.withFirstName(user.getFirstName())
                .withLastName(user.getLastName())
                .withAddress(user.getAddress())
                .withBirthday(user.getBirthday())
                .build();
        return userDTO;
    }


    //Returns a sample user
    public static User createUser(){
        User user = new User();
        user.setBirthday(LocalDate.of(2000, 9, 18));
        user.setFirstName("Hong");
        user.setLastName("Pham");

        Address address = new Address();
        address.setHouseNumber("700");
        address.setStreet("South Florida Ave");
        address.setCity("Tampa");
        address.setZipcode("33607");
        address.setState("Florida");

        user.setAddress(address);
        return user;
    }


}
