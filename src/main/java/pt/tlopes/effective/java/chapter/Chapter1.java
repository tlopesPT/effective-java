package pt.tlopes.effective.java.chapter;

import javax.enterprise.context.ApplicationScoped;

/**
 * Introduction
 */
@ApplicationScoped
public class Chapter1 implements Chapter {

    @Override
    public void start() {
        System.out.println("This is the introduction chapter, nothing to see here.");
    }
}
