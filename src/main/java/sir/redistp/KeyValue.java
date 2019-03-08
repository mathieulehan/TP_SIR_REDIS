package sir.redistp;

import redis.clients.jedis.Jedis;

/**
 * Cle valeur via Redis
 * Stocke une paire cle-valeur
 * Et la renvoie via la methode get
 */
public class KeyValue
{
	public static void main( String[] args )
	{
		Jedis jedis = new Jedis("localhost");
		jedis.set("foo", "bar");
		String value = jedis.get("foo");

		System.err.println(value);    
	}
}

