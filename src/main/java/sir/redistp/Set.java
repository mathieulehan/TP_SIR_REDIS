package sir.redistp;

import redis.clients.jedis.Jedis;

/**
 * Set via Redis (sadd)
 * Stocke des langages dans un "Set"
 * Et les renvoie avec la methode smembers
 * @author mathi
 *
 */
public class Set {

	public static void main(String[] args) {
        String cacheKey = "languages";
        Jedis jedis = new Jedis("localhost");
        // Adding a set as value

        jedis.sadd(cacheKey, "Java");
        jedis.sadd(cacheKey, "C#");
        jedis.sadd(cacheKey, "Python");// SADD

        // Getting all values in the set: SMEMBERS
        System.out.println("Languages: " + jedis.smembers(cacheKey));
        // Adding new values
        jedis.sadd(cacheKey, "Java");
        jedis.sadd(cacheKey, "Ruby");
        // Getting the values... it doesn't allow duplicates
        System.out.println("Languages: " + jedis.smembers(cacheKey));

    }
}
