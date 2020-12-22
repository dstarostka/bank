package com.starostka.bank.user;

import lombok.Builder;

import java.util.Optional;

@Builder
public class UserFacade {
    private UserRepository userRepository;
    private UserCreator userCreator;
    
    public UserDTO addUser(UserDTO userDTO) {
        User user = userCreator.from(userDTO);
        return userRepository.save(user).dto();
    }

    public Optional<UserDTO> getUser(Long id) {
        Optional<User> user = userRepository.findById(id);
        if(user.isPresent()) {
            return Optional.of(user.get().dto());
        }
        return Optional.empty();
    }
}