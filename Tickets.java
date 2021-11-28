/**
 * 
 * The main Tickets object
 * 
 */
import java.util.*;

public class Tickets{
    public String url;
    public int id;
    public Object external_id;
    public Date created_at;
    public Date updated_at;
    public String type;
    public String subject;
    public String raw_subject;
    public String description;
    public String priority;
    public String status;
    public Object recipient;
    public long requester_id;
    public long submitter_id;
    public long assignee_id;
    public Object organization_id;
    public long group_id;
    public List<Object> collaborator_ids;
    public List<Object> follower_ids;
    public List<Object> email_cc_ids;
    public Object forum_topic_id;
    public Object problem_id;
    public boolean has_incidents;
    public boolean is_public;
    public Object due_at;
    public List<String> tags;
    public List<Object> custom_fields;
    public Object satisfaction_rating;
    public List<Object> sharing_agreement_ids;
    public List<Object> fields;
    public List<Object> followup_ids;
    public long ticket_form_id;
    public long brand_id;
    public boolean allow_channelback;
    public boolean allow_attachments;
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Object getExternal_id() {
        return external_id;
    }
    public void setExternal_id(Object external_id) {
        this.external_id = external_id;
    }
    public Date getCreated_at() {
        return created_at;
    }
    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }
    public Date getUpdated_at() {
        return updated_at;
    }
    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getRaw_subject() {
        return raw_subject;
    }
    public void setRaw_subject(String raw_subject) {
        this.raw_subject = raw_subject;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getPriority() {
        return priority;
    }
    public void setPriority(String priority) {
        this.priority = priority;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public Object getRecipient() {
        return recipient;
    }
    public void setRecipient(Object recipient) {
        this.recipient = recipient;
    }
    public long getRequester_id() {
        return requester_id;
    }
    public void setRequester_id(long requester_id) {
        this.requester_id = requester_id;
    }
    public long getSubmitter_id() {
        return submitter_id;
    }
    public void setSubmitter_id(long submitter_id) {
        this.submitter_id = submitter_id;
    }
    public long getAssignee_id() {
        return assignee_id;
    }
    public void setAssignee_id(long assignee_id) {
        this.assignee_id = assignee_id;
    }
    public Object getOrganization_id() {
        return organization_id;
    }
    public void setOrganization_id(Object organization_id) {
        this.organization_id = organization_id;
    }
    public long getGroup_id() {
        return group_id;
    }
    public void setGroup_id(long group_id) {
        this.group_id = group_id;
    }
    public List<Object> getCollaborator_ids() {
        return collaborator_ids;
    }
    public void setCollaborator_ids(List<Object> collaborator_ids) {
        this.collaborator_ids = collaborator_ids;
    }
    public List<Object> getFollower_ids() {
        return follower_ids;
    }
    public void setFollower_ids(List<Object> follower_ids) {
        this.follower_ids = follower_ids;
    }
    public List<Object> getEmail_cc_ids() {
        return email_cc_ids;
    }
    public void setEmail_cc_ids(List<Object> email_cc_ids) {
        this.email_cc_ids = email_cc_ids;
    }
    public Object getForum_topic_id() {
        return forum_topic_id;
    }
    public void setForum_topic_id(Object forum_topic_id) {
        this.forum_topic_id = forum_topic_id;
    }
    public Object getProblem_id() {
        return problem_id;
    }
    public void setProblem_id(Object problem_id) {
        this.problem_id = problem_id;
    }
    public boolean isHas_incidents() {
        return has_incidents;
    }
    public void setHas_incidents(boolean has_incidents) {
        this.has_incidents = has_incidents;
    }
    public boolean isIs_public() {
        return is_public;
    }
    public void setIs_public(boolean is_public) {
        this.is_public = is_public;
    }
    public Object getDue_at() {
        return due_at;
    }
    public void setDue_at(Object due_at) {
        this.due_at = due_at;
    }
    public List<String> getTags() {
        return tags;
    }
    public void setTags(List<String> tags) {
        this.tags = tags;
    }
    public List<Object> getCustom_fields() {
        return custom_fields;
    }
    public void setCustom_fields(List<Object> custom_fields) {
        this.custom_fields = custom_fields;
    }
    public Object getSatisfaction_rating() {
        return satisfaction_rating;
    }
    public void setSatisfaction_rating(Object satisfaction_rating) {
        this.satisfaction_rating = satisfaction_rating;
    }
    public List<Object> getSharing_agreement_ids() {
        return sharing_agreement_ids;
    }
    public void setSharing_agreement_ids(List<Object> sharing_agreement_ids) {
        this.sharing_agreement_ids = sharing_agreement_ids;
    }
    public List<Object> getFields() {
        return fields;
    }
    public void setFields(List<Object> fields) {
        this.fields = fields;
    }
    public List<Object> getFollowup_ids() {
        return followup_ids;
    }
    public void setFollowup_ids(List<Object> followup_ids) {
        this.followup_ids = followup_ids;
    }
    public long getTicket_form_id() {
        return ticket_form_id;
    }
    public void setTicket_form_id(long ticket_form_id) {
        this.ticket_form_id = ticket_form_id;
    }
    public long getBrand_id() {
        return brand_id;
    }
    public void setBrand_id(long brand_id) {
        this.brand_id = brand_id;
    }
    public boolean isAllow_channelback() {
        return allow_channelback;
    }
    public void setAllow_channelback(boolean allow_channelback) {
        this.allow_channelback = allow_channelback;
    }
    public boolean isAllow_attachments() {
        return allow_attachments;
    }
    public void setAllow_attachments(boolean allow_attachments) {
        this.allow_attachments = allow_attachments;
    }
}
