package com.starostka.bank.user;

import com.starostka.bank.utils.InMemoryRepository;

import java.util.Optional;

class InMemoryUserRepository extends InMemoryRepository<User, Long> implements UserRepository {
    @Override
    public Long getId(User entity) {
        return entity.getId();
    }

    @Override
    public User save(User user) {
        return  super.save(user);
    }

    @Override
    public Optional<User> findById(Long id) {
        return super.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}