package sir.redistp;

import redis.clients.jedis.Jedis;

/**
 * Incrementation d'une valeur via Redis
 * On affiche ensuite la valeur incrementee
 * @author mathi
 *
 */
public class Increment {

    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost");
        System.out.println(jedis.get("counter"));
        jedis.incr("counter");
        System.out.println(jedis.get("counter"));
    }

}
