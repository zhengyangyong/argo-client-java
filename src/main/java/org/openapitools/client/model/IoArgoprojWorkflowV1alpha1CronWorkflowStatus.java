/*
 * Argo
 * Argo
 *
 * The version of the OpenAPI document: v2.10.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import org.openapitools.client.model.IoArgoprojWorkflowV1alpha1Condition;
import org.openapitools.client.model.IoK8sApiCoreV1ObjectReference;

/**
 * CronWorkflowStatus is the status of a CronWorkflow
 */
@ApiModel(description = "CronWorkflowStatus is the status of a CronWorkflow")

public class IoArgoprojWorkflowV1alpha1CronWorkflowStatus {
  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private List<IoK8sApiCoreV1ObjectReference> active = null;

  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";
  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private List<IoArgoprojWorkflowV1alpha1Condition> conditions = null;

  public static final String SERIALIZED_NAME_LAST_SCHEDULED_TIME = "lastScheduledTime";
  @SerializedName(SERIALIZED_NAME_LAST_SCHEDULED_TIME)
  private DateTime lastScheduledTime;


  public IoArgoprojWorkflowV1alpha1CronWorkflowStatus active(List<IoK8sApiCoreV1ObjectReference> active) {
    
    this.active = active;
    return this;
  }

  public IoArgoprojWorkflowV1alpha1CronWorkflowStatus addActiveItem(IoK8sApiCoreV1ObjectReference activeItem) {
    if (this.active == null) {
      this.active = new ArrayList<IoK8sApiCoreV1ObjectReference>();
    }
    this.active.add(activeItem);
    return this;
  }

   /**
   * Active is a list of active workflows stemming from this CronWorkflow
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Active is a list of active workflows stemming from this CronWorkflow")

  public List<IoK8sApiCoreV1ObjectReference> getActive() {
    return active;
  }


  public void setActive(List<IoK8sApiCoreV1ObjectReference> active) {
    this.active = active;
  }


  public IoArgoprojWorkflowV1alpha1CronWorkflowStatus conditions(List<IoArgoprojWorkflowV1alpha1Condition> conditions) {
    
    this.conditions = conditions;
    return this;
  }

  public IoArgoprojWorkflowV1alpha1CronWorkflowStatus addConditionsItem(IoArgoprojWorkflowV1alpha1Condition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<IoArgoprojWorkflowV1alpha1Condition>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * Conditions is a list of conditions the CronWorkflow may have
   * @return conditions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Conditions is a list of conditions the CronWorkflow may have")

  public List<IoArgoprojWorkflowV1alpha1Condition> getConditions() {
    return conditions;
  }


  public void setConditions(List<IoArgoprojWorkflowV1alpha1Condition> conditions) {
    this.conditions = conditions;
  }


  public IoArgoprojWorkflowV1alpha1CronWorkflowStatus lastScheduledTime(DateTime lastScheduledTime) {
    
    this.lastScheduledTime = lastScheduledTime;
    return this;
  }

   /**
   * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
   * @return lastScheduledTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.")

  public DateTime getLastScheduledTime() {
    return lastScheduledTime;
  }


  public void setLastScheduledTime(DateTime lastScheduledTime) {
    this.lastScheduledTime = lastScheduledTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojWorkflowV1alpha1CronWorkflowStatus ioArgoprojWorkflowV1alpha1CronWorkflowStatus = (IoArgoprojWorkflowV1alpha1CronWorkflowStatus) o;
    return Objects.equals(this.active, ioArgoprojWorkflowV1alpha1CronWorkflowStatus.active) &&
        Objects.equals(this.conditions, ioArgoprojWorkflowV1alpha1CronWorkflowStatus.conditions) &&
        Objects.equals(this.lastScheduledTime, ioArgoprojWorkflowV1alpha1CronWorkflowStatus.lastScheduledTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, conditions, lastScheduledTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1CronWorkflowStatus {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    lastScheduledTime: ").append(toIndentedString(lastScheduledTime)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
