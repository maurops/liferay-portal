/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portlet.journal.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;

/**
 * The interface for the journal content search local service.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JournalContentSearchLocalServiceUtil
 * @see com.liferay.portlet.journal.service.base.JournalContentSearchLocalServiceBaseImpl
 * @see com.liferay.portlet.journal.service.impl.JournalContentSearchLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface JournalContentSearchLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link JournalContentSearchLocalServiceUtil} to access the journal content search local service. Add custom service methods to {@link com.liferay.portlet.journal.service.impl.JournalContentSearchLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the journal content search to the database. Also notifies the appropriate model listeners.
	*
	* @param journalContentSearch the journal content search to add
	* @return the journal content search that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portlet.journal.model.JournalContentSearch addJournalContentSearch(
		com.liferay.portlet.journal.model.JournalContentSearch journalContentSearch)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Creates a new journal content search with the primary key. Does not add the journal content search to the database.
	*
	* @param contentSearchId the primary key for the new journal content search
	* @return the new journal content search
	*/
	public com.liferay.portlet.journal.model.JournalContentSearch createJournalContentSearch(
		long contentSearchId);

	/**
	* Deletes the journal content search with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param contentSearchId the primary key of the journal content search to delete
	* @throws PortalException if a journal content search with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteJournalContentSearch(long contentSearchId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Deletes the journal content search from the database. Also notifies the appropriate model listeners.
	*
	* @param journalContentSearch the journal content search to delete
	* @throws SystemException if a system exception occurred
	*/
	public void deleteJournalContentSearch(
		com.liferay.portlet.journal.model.JournalContentSearch journalContentSearch)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query to search with
	* @param start the lower bound of the range of model instances to return
	* @param end the upper bound of the range of model instances to return (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query to search with
	* @param start the lower bound of the range of model instances to return
	* @param end the upper bound of the range of model instances to return (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Gets the journal content search with the primary key.
	*
	* @param contentSearchId the primary key of the journal content search to get
	* @return the journal content search
	* @throws PortalException if a journal content search with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portlet.journal.model.JournalContentSearch getJournalContentSearch(
		long contentSearchId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Gets a range of all the journal content searchs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of journal content searchs to return
	* @param end the upper bound of the range of journal content searchs to return (not inclusive)
	* @return the range of journal content searchs
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.liferay.portlet.journal.model.JournalContentSearch> getJournalContentSearchs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Gets the number of journal content searchs.
	*
	* @return the number of journal content searchs
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getJournalContentSearchsCount()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the journal content search in the database. Also notifies the appropriate model listeners.
	*
	* @param journalContentSearch the journal content search to update
	* @return the journal content search that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portlet.journal.model.JournalContentSearch updateJournalContentSearch(
		com.liferay.portlet.journal.model.JournalContentSearch journalContentSearch)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the journal content search in the database. Also notifies the appropriate model listeners.
	*
	* @param journalContentSearch the journal content search to update
	* @param merge whether to merge the journal content search with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the journal content search that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portlet.journal.model.JournalContentSearch updateJournalContentSearch(
		com.liferay.portlet.journal.model.JournalContentSearch journalContentSearch,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Gets the Spring bean id for this ServiceBean.
	*
	* @return the Spring bean id for this ServiceBean
	*/
	public java.lang.String getIdentifier();

	/**
	* Sets the Spring bean id for this ServiceBean.
	*
	* @param identifier the Spring bean id for this ServiceBean
	*/
	public void setIdentifier(java.lang.String identifier);

	public void checkContentSearches(long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public void deleteArticleContentSearch(long groupId, boolean privateLayout,
		long layoutId, java.lang.String portletId, java.lang.String articleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public void deleteArticleContentSearches(long groupId,
		java.lang.String articleId)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void deleteLayoutContentSearches(long groupId,
		boolean privateLayout, long layoutId)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void deleteOwnerContentSearches(long groupId, boolean privateLayout)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.liferay.portlet.journal.model.JournalContentSearch> getArticleContentSearches()
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.liferay.portlet.journal.model.JournalContentSearch> getArticleContentSearches(
		long groupId, java.lang.String articleId)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.liferay.portlet.journal.model.JournalContentSearch> getArticleContentSearches(
		java.lang.String articleId)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<java.lang.Long> getLayoutIds(long groupId,
		boolean privateLayout, java.lang.String articleId)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getLayoutIdsCount(long groupId, boolean privateLayout,
		java.lang.String articleId)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getLayoutIdsCount(java.lang.String articleId)
		throws com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portlet.journal.model.JournalContentSearch updateContentSearch(
		long groupId, boolean privateLayout, long layoutId,
		java.lang.String portletId, java.lang.String articleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portlet.journal.model.JournalContentSearch updateContentSearch(
		long groupId, boolean privateLayout, long layoutId,
		java.lang.String portletId, java.lang.String articleId, boolean purge)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.liferay.portlet.journal.model.JournalContentSearch> updateContentSearch(
		long groupId, boolean privateLayout, long layoutId,
		java.lang.String portletId, java.lang.String[] articleIds)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;
}