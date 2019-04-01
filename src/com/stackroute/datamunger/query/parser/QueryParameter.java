package com.stackroute.datamunger.query.parser;
import java.util.List;
/* 
 * This class will contain the elements of the parsed Query String such as conditions,
 * logical operators,aggregate functions, file name, fields group by fields, order by
 * fields, Query Type
 * */
public class QueryParameter {
	private String queryString;
	private String fileName;
	private String baseQuery;
	private String QUERY_TYPE;
	private List<String> fields;
	private List<Restriction> restrictions;
	private List<String> logicalOperators;
	private List<AggregateFunction> aggregateFunctions;
	private List<String> orderByFields;
	private List<String> groupByFields;
	public String getQueryString() {
		return queryString;
	}
	public void setQueryString(String queryString) {
		this.queryString = queryString;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getBaseQuery() {
		return baseQuery;
	}
	public void setBaseQuery(String baseQuery) {
		this.baseQuery = baseQuery;
	}
	public String getQUERY_TYPE() {
		return QUERY_TYPE;
	}
	public void setQUERY_TYPE(String qUERY_TYPE) {
		QUERY_TYPE = qUERY_TYPE;
	}
	public List<String> getFields() {
		return fields;
	}
	public void setFields(List<String> fields) {
		this.fields = fields;
	}
	public List<Restriction> getRestrictions() {
		return restrictions;
	}
	public void setRestrictions(List<Restriction> restrictions) {
		this.restrictions = restrictions;
	}
	public List<String> getLogicalOperators() {
		return logicalOperators;
	}
	public void setLogicalOperators(List<String> logicalOperators) {
		this.logicalOperators = logicalOperators;
	}
	public List<AggregateFunction> getAggregateFunctions() {
		return aggregateFunctions;
	}
	public void setAggregateFunctions(List<AggregateFunction> aggregateFunctions) {
		this.aggregateFunctions = aggregateFunctions;
	}
	public List<String> getOrderByFields() {
		return orderByFields;
	}
	public void setOrderByFields(List<String> orderByFields) {
		this.orderByFields = orderByFields;
	}
	public List<String> getGroupByFields() {
		return groupByFields;
	}
	public void setGroupByFields(List<String> groupByFields) {
		this.groupByFields = groupByFields;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((QUERY_TYPE == null) ? 0 : QUERY_TYPE.hashCode());
		result = prime * result + ((aggregateFunctions == null) ? 0 : aggregateFunctions.hashCode());
		result = prime * result + ((baseQuery == null) ? 0 : baseQuery.hashCode());
		result = prime * result + ((fields == null) ? 0 : fields.hashCode());
		result = prime * result + ((fileName == null) ? 0 : fileName.hashCode());
		result = prime * result + ((groupByFields == null) ? 0 : groupByFields.hashCode());
		result = prime * result + ((logicalOperators == null) ? 0 : logicalOperators.hashCode());
		result = prime * result + ((orderByFields == null) ? 0 : orderByFields.hashCode());
		result = prime * result + ((queryString == null) ? 0 : queryString.hashCode());
		result = prime * result + ((restrictions == null) ? 0 : restrictions.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		QueryParameter other = (QueryParameter) obj;
		if (QUERY_TYPE == null) {
			if (other.QUERY_TYPE != null)
				return false;
		} else if (!QUERY_TYPE.equals(other.QUERY_TYPE))
			return false;
		if (aggregateFunctions == null) {
			if (other.aggregateFunctions != null)
				return false;
		} else if (!aggregateFunctions.equals(other.aggregateFunctions))
			return false;
		if (baseQuery == null) {
			if (other.baseQuery != null)
				return false;
		} else if (!baseQuery.equals(other.baseQuery))
			return false;
		if (fields == null) {
			if (other.fields != null)
				return false;
		} else if (!fields.equals(other.fields))
			return false;
		if (fileName == null) {
			if (other.fileName != null)
				return false;
		} else if (!fileName.equals(other.fileName))
			return false;
		if (groupByFields == null) {
			if (other.groupByFields != null)
				return false;
		} else if (!groupByFields.equals(other.groupByFields))
			return false;
		if (logicalOperators == null) {
			if (other.logicalOperators != null)
				return false;
		} else if (!logicalOperators.equals(other.logicalOperators))
			return false;
		if (orderByFields == null) {
			if (other.orderByFields != null)
				return false;
		} else if (!orderByFields.equals(other.orderByFields))
			return false;
		if (queryString == null) {
			if (other.queryString != null)
				return false;
		} else if (!queryString.equals(other.queryString))
			return false;
		if (restrictions == null) {
			if (other.restrictions != null)
				return false;
		} else if (!restrictions.equals(other.restrictions))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "QueryParameter [queryString=" + queryString + ", fileName=" + fileName + ", baseQuery=" + baseQuery
				+ ", QUERY_TYPE=" + QUERY_TYPE + ", fields=" + fields + ", restrictions=" + restrictions
				+ ", logicalOperators=" + logicalOperators + ", aggregateFunctions=" + aggregateFunctions
				+ ", orderByFields=" + orderByFields + ", groupByFields=" + groupByFields + "]";
	}
}