/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: release-1.16
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.kubernetes.client.openapi.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.openapi.models.V1alpha1AggregationRule;
import io.kubernetes.client.openapi.models.V1alpha1PolicyRule;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ClusterRole is a cluster level, logical grouping of PolicyRules that can be referenced as a unit by a RoleBinding or ClusterRoleBinding.
 */
@ApiModel(description = "ClusterRole is a cluster level, logical grouping of PolicyRules that can be referenced as a unit by a RoleBinding or ClusterRoleBinding.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-29T07:27:12.312Z[Etc/UTC]")
public class V1alpha1ClusterRole {
  public static final String SERIALIZED_NAME_AGGREGATION_RULE = "aggregationRule";
  @SerializedName(SERIALIZED_NAME_AGGREGATION_RULE)
  private V1alpha1AggregationRule aggregationRule;

  public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";
  @SerializedName(SERIALIZED_NAME_API_VERSION)
  private String apiVersion;

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private V1ObjectMeta metadata;

  public static final String SERIALIZED_NAME_RULES = "rules";
  @SerializedName(SERIALIZED_NAME_RULES)
  private List<V1alpha1PolicyRule> rules = null;


  public V1alpha1ClusterRole aggregationRule(V1alpha1AggregationRule aggregationRule) {
    
    this.aggregationRule = aggregationRule;
    return this;
  }

   /**
   * Get aggregationRule
   * @return aggregationRule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1AggregationRule getAggregationRule() {
    return aggregationRule;
  }


  public void setAggregationRule(V1alpha1AggregationRule aggregationRule) {
    this.aggregationRule = aggregationRule;
  }


  public V1alpha1ClusterRole apiVersion(String apiVersion) {
    
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   * @return apiVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources")

  public String getApiVersion() {
    return apiVersion;
  }


  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }


  public V1alpha1ClusterRole kind(String kind) {
    
    this.kind = kind;
    return this;
  }

   /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   * @return kind
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds")

  public String getKind() {
    return kind;
  }


  public void setKind(String kind) {
    this.kind = kind;
  }


  public V1alpha1ClusterRole metadata(V1ObjectMeta metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1ObjectMeta getMetadata() {
    return metadata;
  }


  public void setMetadata(V1ObjectMeta metadata) {
    this.metadata = metadata;
  }


  public V1alpha1ClusterRole rules(List<V1alpha1PolicyRule> rules) {
    
    this.rules = rules;
    return this;
  }

  public V1alpha1ClusterRole addRulesItem(V1alpha1PolicyRule rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<V1alpha1PolicyRule>();
    }
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * Rules holds all the PolicyRules for this ClusterRole
   * @return rules
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Rules holds all the PolicyRules for this ClusterRole")

  public List<V1alpha1PolicyRule> getRules() {
    return rules;
  }


  public void setRules(List<V1alpha1PolicyRule> rules) {
    this.rules = rules;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ClusterRole v1alpha1ClusterRole = (V1alpha1ClusterRole) o;
    return Objects.equals(this.aggregationRule, v1alpha1ClusterRole.aggregationRule) &&
        Objects.equals(this.apiVersion, v1alpha1ClusterRole.apiVersion) &&
        Objects.equals(this.kind, v1alpha1ClusterRole.kind) &&
        Objects.equals(this.metadata, v1alpha1ClusterRole.metadata) &&
        Objects.equals(this.rules, v1alpha1ClusterRole.rules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregationRule, apiVersion, kind, metadata, rules);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ClusterRole {\n");
    sb.append("    aggregationRule: ").append(toIndentedString(aggregationRule)).append("\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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
