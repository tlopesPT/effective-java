package pt.tlopes.effective.java;

import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import javax.inject.Inject;
import pt.tlopes.effective.java.chapter.Chapter1;
import pt.tlopes.effective.java.chapter.Chapter2;
import pt.tlopes.effective.java.chapter.Chapter3;

@QuarkusMain
public class Main implements QuarkusApplication {

    @Inject
    Chapter1 chapter1;

    @Inject
    Chapter2 chapter2;

    @Inject
    Chapter3 chapter3;

    @Override
    public int run(String... args) throws Exception {
        chapter1.start();
        chapter2.start();
        chapter3.start();

        return 0;
    }
}
