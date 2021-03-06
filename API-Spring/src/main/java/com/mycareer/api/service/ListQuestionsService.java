package com.mycareer.api.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.mycareer.api.model.ListQuestions;
import com.mycareer.api.repository.ListQuestionsRepository;


/**
 * The Class ListQuestionsService.
 * 
 * @author Alexander Souza
 */
@Service
public class ListQuestionsService {

	@Autowired
	private ListQuestionsRepository listQuestionsRepository;

	/**
	 * Update ListQuestions.
	 *
	 * @param code the code
	 * @param question the question
	 * @return the list questions
	 */
	public ListQuestions update(Long code, ListQuestions question) {
		ListQuestions saveList = findByCode(code);

		BeanUtils.copyProperties(question, saveList, "code");
		return listQuestionsRepository.save(saveList);
	}

	/**
	 * Find List questions by code.
	 *
	 * @param code the code
	 * @return the list questions
	 */
	public ListQuestions findByCode(Long code) {
		ListQuestions saveList = listQuestionsRepository.findOne(code);
		if (saveList == null) {
			throw new EmptyResultDataAccessException(1);
		}
		return saveList;
	}

}
