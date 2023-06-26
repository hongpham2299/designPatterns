package builderPattern.builder;

import builderPattern.model.Address;

import java.time.LocalDate;

//Builder
public interface UserDTOBuilder {

    //Methods to build the parts of product at a time
    UserDTOBuilder withFirstName(String fName);
    UserDTOBuilder withLastName(String lName);
    UserDTOBuilder withBirthday(LocalDate date);
    UserDTOBuilder withAddress(Address address);

    //Method to assemble the final product/object
    UserDTO build();

    //Method to fetch the already built object. This method is optional
    UserDTO getUserDTO();
}
