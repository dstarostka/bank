package com.starostka.bank.user

import spock.lang.Specification

class AddUserSpec extends Specification implements UserSample {
    UserFacade userFacade = new UserConfiguration().userFacade()

    def "should add new user"() {
        when: "add user"
        UserDTO newUser = userFacade.addUser(JANUSZ)

        then: "user exist"
        userFacade.getUser(newUser.getId()).get().getFirstName() == JANUSZ.firstName
    }

    def "should remove user"() {
        when: "remove user"
        userFacade.removeUser(JANUSZ.id)

        then: "user doesn't exist"
        userFacade.getUser(JANUSZ.id).isEmpty()
    }
}