package hw28.service;

import org.springframework.lang.Nullable;

import java.util.Optional;


public class ArchiveService {

    Optional<String> zip(String source);

    Optional<String> unzip(String source, @Nullable String password);
}
