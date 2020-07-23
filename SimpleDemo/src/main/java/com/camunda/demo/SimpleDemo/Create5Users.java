package com.camunda.demo.SimpleDemo;

import java.util.Collection;
import java.util.Date;
import java.util.Map;
import java.util.Set;

import org.camunda.bpm.engine.IdentityService;
import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.ProcessEngineServices;
import org.camunda.bpm.engine.delegate.DelegateCaseExecution;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.DelegateTask;
import org.camunda.bpm.engine.identity.User;
import org.camunda.bpm.engine.task.IdentityLink;
import org.camunda.bpm.engine.variable.VariableMap;
import org.camunda.bpm.engine.variable.value.TypedValue;
import org.camunda.bpm.model.bpmn.BpmnModelInstance;
import org.camunda.bpm.model.bpmn.instance.UserTask;

public class Create5Users implements DelegateTask{
	
	
	public void notify(DelegateTask delegateTask) {  
	       
	       
        IdentityService identityService = delegateTask.getProcessEngine().getIdentityService() ;
       User user =  identityService.newUser("sagar") ;
       String userId = user.getId();
       System.out.println(user.getEmail());
       System.out.println(user.getFirstName());       
       identityService.unlockUser(userId);
	}
	
	public String getId(User user) {
		String userid = user.getId();
		return userid;
	}

	@Override
	public String getVariableScopeKey() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> getVariables() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VariableMap getVariablesTyped() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VariableMap getVariablesTyped(boolean deserializeValues) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> getVariablesLocal() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VariableMap getVariablesLocalTyped() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VariableMap getVariablesLocalTyped(boolean deserializeValues) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getVariable(String variableName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getVariableLocal(String variableName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends TypedValue> T getVariableTyped(String variableName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends TypedValue> T getVariableTyped(String variableName, boolean deserializeValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends TypedValue> T getVariableLocalTyped(String variableName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends TypedValue> T getVariableLocalTyped(String variableName, boolean deserializeValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<String> getVariableNames() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<String> getVariableNamesLocal() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setVariable(String variableName, Object value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setVariableLocal(String variableName, Object value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setVariables(Map<String, ? extends Object> variables) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setVariablesLocal(Map<String, ? extends Object> variables) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean hasVariables() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasVariablesLocal() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasVariable(String variableName) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasVariableLocal(String variableName) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void removeVariable(String variableName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeVariableLocal(String variableName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeVariables(Collection<String> variableNames) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeVariablesLocal(Collection<String> variableNames) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeVariables() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeVariablesLocal() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BpmnModelInstance getBpmnModelInstance() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProcessEngineServices getProcessEngineServices() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProcessEngine getProcessEngine() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDescription(String description) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getPriority() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setPriority(int priority) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getProcessInstanceId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getExecutionId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getProcessDefinitionId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCaseInstanceId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCaseExecutionId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCaseDefinitionId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Date getCreateTime() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTaskDefinitionKey() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DelegateExecution getExecution() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DelegateCaseExecution getCaseExecution() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getEventName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addCandidateUser(String userId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addCandidateUsers(Collection<String> candidateUsers) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addCandidateGroup(String groupId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addCandidateGroups(Collection<String> candidateGroups) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getOwner() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setOwner(String owner) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getAssignee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAssignee(String assignee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Date getDueDate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDueDate(Date dueDate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getDeleteReason() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addUserIdentityLink(String userId, String identityLinkType) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addGroupIdentityLink(String groupId, String identityLinkType) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCandidateUser(String userId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCandidateGroup(String groupId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUserIdentityLink(String userId, String identityLinkType) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteGroupIdentityLink(String groupId, String identityLinkType) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<IdentityLink> getCandidates() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserTask getBpmnModelElementInstance() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTenantId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void complete() {
		// TODO Auto-generated method stub
		
	}
}
