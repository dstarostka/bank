package com.starostka.bank.user;

class UserCreator {

    User from(UserDTO userDTO) {
        return User.builder()
                .userId(userDTO.getId())
                .firstName(userDTO.getFirstName())
                .lastName(userDTO.getLastName())
                .pesel(userDTO.getPesel())
                .accounts(userDTO.getAccounts())
                .postalCode(userDTO.getPostalCode())
                .city(userDTO.getCity())
                .street(userDTO.getStreet())
                .houseNumber(userDTO.getHouseNumber())
                .additionalInfo(userDTO.getAdditionalInfo())
                .build();
    }
}