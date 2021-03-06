/*
 * Argo Server API
 * You can get examples of requests and responses by using the CLI with `--gloglevel=9`, e.g. `argo list --gloglevel=9`
 *
 * The version of the OpenAPI document: v2.11.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.argoproj.workflow.apis;

import io.argoproj.workflow.ApiException;
import io.argoproj.workflow.models.StreamResultOfEvent;
import io.argoproj.workflow.models.StreamResultOfLogEntry;
import io.argoproj.workflow.models.StreamResultOfWorkflowWatchEvent;
import io.argoproj.workflow.models.Workflow;
import io.argoproj.workflow.models.WorkflowCreateRequest;
import io.argoproj.workflow.models.WorkflowLintRequest;
import io.argoproj.workflow.models.WorkflowList;
import io.argoproj.workflow.models.WorkflowResubmitRequest;
import io.argoproj.workflow.models.WorkflowResumeRequest;
import io.argoproj.workflow.models.WorkflowRetryRequest;
import io.argoproj.workflow.models.WorkflowSetRequest;
import io.argoproj.workflow.models.WorkflowStopRequest;
import io.argoproj.workflow.models.WorkflowSubmitRequest;
import io.argoproj.workflow.models.WorkflowSuspendRequest;
import io.argoproj.workflow.models.WorkflowTerminateRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WorkflowServiceApi
 */
@Ignore
public class WorkflowServiceApiTest {

    private final WorkflowServiceApi api = new WorkflowServiceApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createWorkflowTest() throws ApiException {
        String namespace = null;
        WorkflowCreateRequest body = null;
        Workflow response = api.createWorkflow(namespace, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteWorkflowTest() throws ApiException {
        String namespace = null;
        String name = null;
        String deleteOptionsGracePeriodSeconds = null;
        String deleteOptionsPreconditionsUid = null;
        String deleteOptionsPreconditionsResourceVersion = null;
        Boolean deleteOptionsOrphanDependents = null;
        String deleteOptionsPropagationPolicy = null;
        List<String> deleteOptionsDryRun = null;
        Object response = api.deleteWorkflow(namespace, name, deleteOptionsGracePeriodSeconds, deleteOptionsPreconditionsUid, deleteOptionsPreconditionsResourceVersion, deleteOptionsOrphanDependents, deleteOptionsPropagationPolicy, deleteOptionsDryRun);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWorkflowTest() throws ApiException {
        String namespace = null;
        String name = null;
        String getOptionsResourceVersion = null;
        String fields = null;
        Workflow response = api.getWorkflow(namespace, name, getOptionsResourceVersion, fields);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void lintWorkflowTest() throws ApiException {
        String namespace = null;
        WorkflowLintRequest body = null;
        Workflow response = api.lintWorkflow(namespace, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listWorkflowsTest() throws ApiException {
        String namespace = null;
        String listOptionsLabelSelector = null;
        String listOptionsFieldSelector = null;
        Boolean listOptionsWatch = null;
        Boolean listOptionsAllowWatchBookmarks = null;
        String listOptionsResourceVersion = null;
        String listOptionsTimeoutSeconds = null;
        String listOptionsLimit = null;
        String listOptionsContinue = null;
        String fields = null;
        WorkflowList response = api.listWorkflows(namespace, listOptionsLabelSelector, listOptionsFieldSelector, listOptionsWatch, listOptionsAllowWatchBookmarks, listOptionsResourceVersion, listOptionsTimeoutSeconds, listOptionsLimit, listOptionsContinue, fields);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void podLogsTest() throws ApiException {
        String namespace = null;
        String name = null;
        String podName = null;
        String logOptionsContainer = null;
        Boolean logOptionsFollow = null;
        Boolean logOptionsPrevious = null;
        String logOptionsSinceSeconds = null;
        String logOptionsSinceTimeSeconds = null;
        Integer logOptionsSinceTimeNanos = null;
        Boolean logOptionsTimestamps = null;
        String logOptionsTailLines = null;
        String logOptionsLimitBytes = null;
        Boolean logOptionsInsecureSkipTLSVerifyBackend = null;
        StreamResultOfLogEntry response = api.podLogs(namespace, name, podName, logOptionsContainer, logOptionsFollow, logOptionsPrevious, logOptionsSinceSeconds, logOptionsSinceTimeSeconds, logOptionsSinceTimeNanos, logOptionsTimestamps, logOptionsTailLines, logOptionsLimitBytes, logOptionsInsecureSkipTLSVerifyBackend);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void resubmitWorkflowTest() throws ApiException {
        String namespace = null;
        String name = null;
        WorkflowResubmitRequest body = null;
        Workflow response = api.resubmitWorkflow(namespace, name, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void resumeWorkflowTest() throws ApiException {
        String namespace = null;
        String name = null;
        WorkflowResumeRequest body = null;
        Workflow response = api.resumeWorkflow(namespace, name, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retryWorkflowTest() throws ApiException {
        String namespace = null;
        String name = null;
        WorkflowRetryRequest body = null;
        Workflow response = api.retryWorkflow(namespace, name, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setWorkflowTest() throws ApiException {
        String namespace = null;
        String name = null;
        WorkflowSetRequest body = null;
        Workflow response = api.setWorkflow(namespace, name, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void stopWorkflowTest() throws ApiException {
        String namespace = null;
        String name = null;
        WorkflowStopRequest body = null;
        Workflow response = api.stopWorkflow(namespace, name, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void submitWorkflowTest() throws ApiException {
        String namespace = null;
        WorkflowSubmitRequest body = null;
        Workflow response = api.submitWorkflow(namespace, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void suspendWorkflowTest() throws ApiException {
        String namespace = null;
        String name = null;
        WorkflowSuspendRequest body = null;
        Workflow response = api.suspendWorkflow(namespace, name, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void terminateWorkflowTest() throws ApiException {
        String namespace = null;
        String name = null;
        WorkflowTerminateRequest body = null;
        Workflow response = api.terminateWorkflow(namespace, name, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void watchEventsTest() throws ApiException {
        String namespace = null;
        String listOptionsLabelSelector = null;
        String listOptionsFieldSelector = null;
        Boolean listOptionsWatch = null;
        Boolean listOptionsAllowWatchBookmarks = null;
        String listOptionsResourceVersion = null;
        String listOptionsTimeoutSeconds = null;
        String listOptionsLimit = null;
        String listOptionsContinue = null;
        StreamResultOfEvent response = api.watchEvents(namespace, listOptionsLabelSelector, listOptionsFieldSelector, listOptionsWatch, listOptionsAllowWatchBookmarks, listOptionsResourceVersion, listOptionsTimeoutSeconds, listOptionsLimit, listOptionsContinue);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void watchWorkflowsTest() throws ApiException {
        String namespace = null;
        String listOptionsLabelSelector = null;
        String listOptionsFieldSelector = null;
        Boolean listOptionsWatch = null;
        Boolean listOptionsAllowWatchBookmarks = null;
        String listOptionsResourceVersion = null;
        String listOptionsTimeoutSeconds = null;
        String listOptionsLimit = null;
        String listOptionsContinue = null;
        StreamResultOfWorkflowWatchEvent response = api.watchWorkflows(namespace, listOptionsLabelSelector, listOptionsFieldSelector, listOptionsWatch, listOptionsAllowWatchBookmarks, listOptionsResourceVersion, listOptionsTimeoutSeconds, listOptionsLimit, listOptionsContinue);

        // TODO: test validations
    }
    
}
