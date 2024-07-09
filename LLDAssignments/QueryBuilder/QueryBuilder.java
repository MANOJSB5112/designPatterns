package LLDAssignments.QueryBuilder;

@WithBuilder
public class QueryBuilder {

    private String select;
    private String from;
    private String where;
    private String join;
    private String orderBy;
    private String groupBy;

    public QueryBuilder(String select, String from, String where, String join, String orderBy, String groupBy) {
        this.select = select;
        this.from = from;
        this.where = where;
        this.join = join;
        this.orderBy = orderBy;
        this.groupBy = groupBy;
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public static class Builder {

        private String select;
        private String from;
        private String where;
        private String join;
        private String orderBy;
        private String groupBy;

        public String getSelect() {
            return select;
        }

        public Builder setSelect(String select)
        {
            this.select=select;
            return this;
        }


        public String getFrom() {
            return from;
        }

        public Builder setFrom(String from)
        {
            this.from=from;
            return this;
        }

        public String getWhere() {
            return where;
        }
        public Builder setWhere(String where)
        {
            this.where=where;
            return this;
        }

        public String getJoin() {
            return join;
        }
        public Builder setJoin(String join)
        {
            this.join=join;
            return this;
        }

        public String getOrderBy() {
            return orderBy;
        }
        public Builder setOrderBy(String orderBy)
        {
            this.orderBy=orderBy;
            return this;
        }

        public String getGroupBy() {
            return groupBy;
        }
        public Builder setGroupBy(String groupBy)
        {
            this.groupBy=groupBy;
            return this;
        }
        public QueryBuilder build()
        {
            return new QueryBuilder(this.select,this.from,this.where,this.join,this.orderBy,this.groupBy);
        }
    }
}