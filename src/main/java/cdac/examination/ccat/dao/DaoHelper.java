package cdac.examination.ccat.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * The GenericDao is a helper class providing common data access functionality for use (via delegation) by Dao classes
 */
public class DaoHelper {

  @PersistenceContext
  private EntityManager entityManager;

  /**
   * Defines ASC and DESC sort orders for queries.
   */
  public enum SortOrder {
    ASC, DESC
  }

  public DaoHelper() {
  }

  /**
   * Custom entity manager that will not automatically be injected.
   */
  public DaoHelper(final EntityManager entityManager) {
    this.entityManager = entityManager;
  }

  
  /**Find an object by its Id from repository
   * 
   */
  public <T> T findById(final Class<T> entityClass, final Object id) {
    if (null == entityClass) throw new IllegalArgumentException("entityClass can't be null");
    if (null == id) throw new IllegalArgumentException("id can't be null");

    return entityManager.find(entityClass, id);
  }

  /**Deletes an object from repository
   * 
   * @param entity
   * @return
   */
  public boolean delete(final Object entity) {
    if (null == entity) throw new IllegalArgumentException("entity can't be null");

    entityManager.remove(entity);
    return true;
  }
  
  /**Deletes an object by its id from repository
   * 
   * @param <T>
   * @param entityClass
   * @param id
   * @return
   */
  public <T> boolean deleteById(final Class<T> entityClass, final Object id) {
    if (null == entityClass) throw new IllegalArgumentException("entityClass can't be null");
    if (null == id) throw new IllegalArgumentException("id can't be null");

    return delete(findById(entityClass, id));
  }

  /**Casts the result to a particular class type
   * @param <T>
   * @param results
   * @return
   */
  @SuppressWarnings("unchecked")
  private <T> List<T> castResultList(List<?> results) {
    return (List<T>) results;
  }

  
  /**Delete an object by an attribute value
 * @param entityClass
 * @param attributeName
 * @param attributeValue
 * @return
 */
  public int deleteByAttribute(final Class<?> entityClass, final String attributeName, final Object attributeValue) {
    if (null == entityClass) throw new IllegalArgumentException("entityClass can't be null");
    if (null == attributeName) throw new IllegalArgumentException("attributeName can't be null");
    if (null == attributeValue) throw new IllegalArgumentException("attributeValue can't be null");

    return entityManager.createQuery(
        "delete from " + entityClass.getSimpleName() + " e where e." + attributeName + " = ?1").setParameter(1,
        attributeValue).executeUpdate();
  }

  /**Find a list of objects by attribute value
 * @param <T>
 * @param entityClass
 * @param attributeName
 * @param attributeValue
 * @return
 */
  public <T> List<T> findByAttribute(final Class<T> entityClass, final String attributeName, final Object attributeValue) {
    if (null == entityClass) throw new IllegalArgumentException("entityClass can't be null");
    if (null == attributeName) throw new IllegalArgumentException("attributeName can't be null");
    if (null == attributeValue) throw new IllegalArgumentException("attributeValue can't be null");

    return castResultList(entityManager.createQuery(
        "select e from " + entityClass.getSimpleName() + " e where e." + attributeName + " = ?1").setParameter(1,
        attributeValue).getResultList());
  }

  /**Provides a list of objects by attribute value in sorted order
 * @param <T>
 * @param entityClass
 * @param attributeName
 * @param attributeValue
 * @param orderByAttributeName
 * @param sortOrder
 * @return
 */
public <T> List<T> findByAttribute(final Class<T> entityClass, final String attributeName,
      final Object attributeValue, final String orderByAttributeName, final SortOrder sortOrder) {
    if (null == entityClass) throw new IllegalArgumentException("entityClass can't be null");
    if (null == attributeName) throw new IllegalArgumentException("attributeName can't be null");
    if (null == attributeValue) throw new IllegalArgumentException("attributeValue can't be null");
    if (null == orderByAttributeName) throw new IllegalArgumentException("orderByAttributeName can't be null");

    return castResultList(entityManager.createQuery(
        "select e from " + entityClass.getSimpleName() + " e where e." + attributeName + " = ?1 ORDER BY e."
            + orderByAttributeName + " " + sortOrder.name()).setParameter(1, attributeValue).getResultList());
  }

  /**Provides all objects of a particular class
 * @param <T>
 * @param entityClass
 * @return
 */
	public <T> List<T> getAllEntities(final Class<T> entityClass) {
    if (null == entityClass) throw new IllegalArgumentException("entityClass can't be null");

    return castResultList(entityManager.createQuery("select e from " + entityClass.getSimpleName() + " e")
        .getResultList());
  }

  /**Provides all objects of a class ordered by attribute name
 * @param <T>
 * @param entityClass
 * @param orderByAttributeName
 * @param sortOrder
 * @return
 */
	public <T> List<T> getAllEntities(final Class<T> entityClass, final String orderByAttributeName,
      final SortOrder sortOrder) {
    if (null == entityClass) throw new IllegalArgumentException("entityClass can't be null");
    if (null == orderByAttributeName) throw new IllegalArgumentException("orderByAttributeName can't be null");

    return castResultList(entityManager.createQuery(
        "select e from " + entityClass.getSimpleName() + " e order by e." + orderByAttributeName + " "
            + sortOrder.name()).getResultList());
  }

  /**Saves an object to the repository
 * @param <T>
 * @param entityClass
 * @param entity
 * @return
 */
	public <T> T persist(final Class<T> entityClass, final T entity) {
    if (null == entityClass) throw new IllegalArgumentException("entityClass can't be null");
    if (null == entity) throw new IllegalArgumentException("entity can't be null");

    entityManager.persist(entity);
    return entity;
  }

  /**Merges an object in the repository
 * @param <T>
 * @param entityClass
 * @param entity
 * @return
 */
public <T> T merge(final Class<T> entityClass, final T entity) {
    if (null == entityClass) throw new IllegalArgumentException("entityClass can't be null");
    if (null == entity) throw new IllegalArgumentException("entity can't be null");

    return entityManager.merge(entity);
  }

  /**Counts the number of objects of a class
 * @param entityClass
 * @return
 */
public long countEntities(final Class<?> entityClass) {
    if (null == entityClass) throw new IllegalArgumentException("entityClass can't be null");

    return (Long) entityManager.createQuery("select count(entity) from " + entityClass.getSimpleName() + " entity")
        .getSingleResult();
  }

  /**Counts the number of objects of a class having a particular value
 * @param entityClass
 * @param attributeName
 * @param attributeValue
 * @return
 */
public long countEntitiesByAttribute(final Class<?> entityClass, final String attributeName,
      final Object attributeValue) {
    if (null == entityClass) throw new IllegalArgumentException("entityClass can't be null");
    if (null == attributeName) throw new IllegalArgumentException("attributeName can't be null");
    if (null == attributeValue) throw new IllegalArgumentException("attributeValue can't be null");

    return (Long) entityManager.createQuery(
        "select count(e) from " + entityClass.getSimpleName() + " e where e." + attributeName + " = ?1").setParameter(
        1, attributeValue).getSingleResult();
  }

}
