/*
 * Argo
 * Workflow Service API performs CRUD actions against application resources
 *
 * The version of the OpenAPI document: v2.6.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.argoproj.workflow.models;

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

/**
 * Represents a cinder volume resource in Openstack. A Cinder volume must exist before mounting to a container. The volume must also be in the same region as the kubelet. Cinder volumes support ownership management and SELinux relabeling.
 */
@ApiModel(description = "Represents a cinder volume resource in Openstack. A Cinder volume must exist before mounting to a container. The volume must also be in the same region as the kubelet. Cinder volumes support ownership management and SELinux relabeling.")

public class CinderVolumeSource {
  public static final String SERIALIZED_NAME_FS_TYPE = "fsType";
  @SerializedName(SERIALIZED_NAME_FS_TYPE)
  private String fsType;

  public static final String SERIALIZED_NAME_READ_ONLY = "readOnly";
  @SerializedName(SERIALIZED_NAME_READ_ONLY)
  private Boolean readOnly;

  public static final String SERIALIZED_NAME_SECRET_REF = "secretRef";
  @SerializedName(SERIALIZED_NAME_SECRET_REF)
  private io.kubernetes.client.models.V1LocalObjectReference secretRef;

  public static final String SERIALIZED_NAME_VOLUME_I_D = "volumeID";
  @SerializedName(SERIALIZED_NAME_VOLUME_I_D)
  private String volumeID;


  public CinderVolumeSource fsType(String fsType) {
    
    this.fsType = fsType;
    return this;
  }

   /**
   * Get fsType
   * @return fsType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFsType() {
    return fsType;
  }


  public void setFsType(String fsType) {
    this.fsType = fsType;
  }


  public CinderVolumeSource readOnly(Boolean readOnly) {
    
    this.readOnly = readOnly;
    return this;
  }

   /**
   * Get readOnly
   * @return readOnly
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getReadOnly() {
    return readOnly;
  }


  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }


  public CinderVolumeSource secretRef(io.kubernetes.client.models.V1LocalObjectReference secretRef) {
    
    this.secretRef = secretRef;
    return this;
  }

   /**
   * Get secretRef
   * @return secretRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public io.kubernetes.client.models.V1LocalObjectReference getSecretRef() {
    return secretRef;
  }


  public void setSecretRef(io.kubernetes.client.models.V1LocalObjectReference secretRef) {
    this.secretRef = secretRef;
  }


  public CinderVolumeSource volumeID(String volumeID) {
    
    this.volumeID = volumeID;
    return this;
  }

   /**
   * Get volumeID
   * @return volumeID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVolumeID() {
    return volumeID;
  }


  public void setVolumeID(String volumeID) {
    this.volumeID = volumeID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CinderVolumeSource cinderVolumeSource = (CinderVolumeSource) o;
    return Objects.equals(this.fsType, cinderVolumeSource.fsType) &&
        Objects.equals(this.readOnly, cinderVolumeSource.readOnly) &&
        Objects.equals(this.secretRef, cinderVolumeSource.secretRef) &&
        Objects.equals(this.volumeID, cinderVolumeSource.volumeID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fsType, readOnly, secretRef, volumeID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CinderVolumeSource {\n");
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    secretRef: ").append(toIndentedString(secretRef)).append("\n");
    sb.append("    volumeID: ").append(toIndentedString(volumeID)).append("\n");
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
