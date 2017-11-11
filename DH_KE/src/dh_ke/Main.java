
package dh_ke;

public class Main {

    public static void main(final String[] args) throws Exception {

        new Main().init();
    }

    private void init() {
        
        final Person alice = new Person();
        final Person bob   = new Person();

        alice.generateKeys();
        bob.generateKeys();

        alice.receivePublicKeyFrom(bob);
        bob.receivePublicKeyFrom(alice);

        alice.generateCommonSecretKey();
        bob.generateCommonSecretKey();

        alice.encryptAndSendMessage("Bob! Guess Who I am.", bob);

        bob.whisperTheSecretMessage();

    }
}

