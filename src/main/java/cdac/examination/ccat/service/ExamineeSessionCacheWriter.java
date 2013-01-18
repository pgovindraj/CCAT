package cdac.examination.ccat.service;

import cdac.examination.ccat.service.exam.ExamineeSessionServiceImpl;
import net.sf.ehcache.CacheEntry;
import net.sf.ehcache.CacheException;
import net.sf.ehcache.Element;


public class ExamineeSessionCacheWriter {
	
	private ExamineeSessionServiceImpl examineeSessionService;
	
	public ExamineeSessionCacheWriter(
			ExamineeSessionServiceImpl examineeSessionService) {
		this.examineeSessionService = examineeSessionService;
	}

	/**Called when elements from the cache is removed
	 * @param cacheEntry
	 * @throws CacheException
	 */
	public void delete(CacheEntry cacheEntry)throws CacheException
	{
		
	}
	
	/**Called when elements are added to cache
	 * @param element
	 * @throws CacheException
	 */
	public void write(Element element)throws CacheException
	{
		
	}

}
