package uk.ac.hereford.djw9349.objects;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import uk.ac.hereford.djw9349.enums.Role;

@RequiredArgsConstructor
@Getter
public class User {
    @NonNull
    private String username;
    @NonNull
    private String password;
    @NonNull
    private Role role;
}
