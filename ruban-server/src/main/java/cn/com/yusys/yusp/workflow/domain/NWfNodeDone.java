package cn.com.yusys.yusp.workflow.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "N_WF_NODE_DONE")
public class NWfNodeDone implements Serializable {
    /**
     * ʵ��id
     */
    @Id
    @Column(name = "INSTANCE_ID")
    private String instanceId;

    /**
     * �ڵ�id
     */
    @Id
    @Column(name = "NODE_ID")
    private String nodeId;

    /**
     * �ڵ��ʶ
     */
    @Column(name = "NODE_SIGN")
    private String nodeSign;

    /**
     * �ڵ�����
     */
    @Column(name = "NODE_NAME")
    private String nodeName;

    /**
     * �ڵ�״̬
     */
    @Column(name = "NODE_STATE")
    private String nodeState;

    /**
     * �ڵ㿪ʼʱ��
     */
    @Column(name = "START_TIME")
    private String startTime;

    @Column(name = "END_TIME")
    private String endTime;

    /**
     * �ύ�˻���id
     */
    @Column(name = "ORG_ID")
    private String orgId;

    /**
     * ��һ�ڵ�id
     */
    @Column(name = "LAST_NODE_ID")
    private String lastNodeId;

    /**
     * ��һ�ڵ�����
     */
    @Column(name = "LAST_NODE_NAME")
    private String lastNodeName;

    /**
     * �����Ľڵ�ȼ�֮��
     */
    @Column(name = "NODE_LEVEL_TOTAL")
    private Long nodeLevelTotal;

    /**
     * �ڵ�����
     */
    @Column(name = "NODE_TYPE")
    private String nodeType;

    @Column(name = "NEXT_NODE_ID")
    private String nextNodeId;

    /**
     * ��һ�ڵ㴦����
     */
    @Column(name = "NEXT_USER_ID")
    private String nextUserId;

    private static final long serialVersionUID = 1L;

    /**
     * ��ȡʵ��id
     *
     * @return INSTANCE_ID - ʵ��id
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * ����ʵ��id
     *
     * @param instanceId ʵ��id
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId == null ? null : instanceId.trim();
    }

    /**
     * ��ȡ�ڵ�id
     *
     * @return NODE_ID - �ڵ�id
     */
    public String getNodeId() {
        return nodeId;
    }

    /**
     * ���ýڵ�id
     *
     * @param nodeId �ڵ�id
     */
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId == null ? null : nodeId.trim();
    }

    /**
     * ��ȡ�ڵ��ʶ
     *
     * @return NODE_SIGN - �ڵ��ʶ
     */
    public String getNodeSign() {
        return nodeSign;
    }

    /**
     * ���ýڵ��ʶ
     *
     * @param nodeSign �ڵ��ʶ
     */
    public void setNodeSign(String nodeSign) {
        this.nodeSign = nodeSign == null ? null : nodeSign.trim();
    }

    /**
     * ��ȡ�ڵ�����
     *
     * @return NODE_NAME - �ڵ�����
     */
    public String getNodeName() {
        return nodeName;
    }

    /**
     * ���ýڵ�����
     *
     * @param nodeName �ڵ�����
     */
    public void setNodeName(String nodeName) {
        this.nodeName = nodeName == null ? null : nodeName.trim();
    }

    /**
     * ��ȡ�ڵ�״̬
     *
     * @return NODE_STATE - �ڵ�״̬
     */
    public String getNodeState() {
        return nodeState;
    }

    /**
     * ���ýڵ�״̬
     *
     * @param nodeState �ڵ�״̬
     */
    public void setNodeState(String nodeState) {
        this.nodeState = nodeState == null ? null : nodeState.trim();
    }

    /**
     * ��ȡ�ڵ㿪ʼʱ��
     *
     * @return START_TIME - �ڵ㿪ʼʱ��
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * ���ýڵ㿪ʼʱ��
     *
     * @param startTime �ڵ㿪ʼʱ��
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime == null ? null : startTime.trim();
    }

    /**
     * @return END_TIME
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime == null ? null : endTime.trim();
    }

    /**
     * ��ȡ�ύ�˻���id
     *
     * @return ORG_ID - �ύ�˻���id
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * �����ύ�˻���id
     *
     * @param orgId �ύ�˻���id
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    /**
     * ��ȡ��һ�ڵ�id
     *
     * @return LAST_NODE_ID - ��һ�ڵ�id
     */
    public String getLastNodeId() {
        return lastNodeId;
    }

    /**
     * ������һ�ڵ�id
     *
     * @param lastNodeId ��һ�ڵ�id
     */
    public void setLastNodeId(String lastNodeId) {
        this.lastNodeId = lastNodeId == null ? null : lastNodeId.trim();
    }

    /**
     * ��ȡ��һ�ڵ�����
     *
     * @return LAST_NODE_NAME - ��һ�ڵ�����
     */
    public String getLastNodeName() {
        return lastNodeName;
    }

    /**
     * ������һ�ڵ�����
     *
     * @param lastNodeName ��һ�ڵ�����
     */
    public void setLastNodeName(String lastNodeName) {
        this.lastNodeName = lastNodeName == null ? null : lastNodeName.trim();
    }

    /**
     * ��ȡ�����Ľڵ�ȼ�֮��
     *
     * @return NODE_LEVEL_TOTAL - �����Ľڵ�ȼ�֮��
     */
    public Long getNodeLevelTotal() {
        return nodeLevelTotal;
    }

    /**
     * ���������Ľڵ�ȼ�֮��
     *
     * @param nodeLevelTotal �����Ľڵ�ȼ�֮��
     */
    public void setNodeLevelTotal(Long nodeLevelTotal) {
        this.nodeLevelTotal = nodeLevelTotal;
    }

    /**
     * ��ȡ�ڵ�����
     *
     * @return NODE_TYPE - �ڵ�����
     */
    public String getNodeType() {
        return nodeType;
    }

    /**
     * ���ýڵ�����
     *
     * @param nodeType �ڵ�����
     */
    public void setNodeType(String nodeType) {
        this.nodeType = nodeType == null ? null : nodeType.trim();
    }

    /**
     * @return NEXT_NODE_ID
     */
    public String getNextNodeId() {
        return nextNodeId;
    }

    /**
     * @param nextNodeId
     */
    public void setNextNodeId(String nextNodeId) {
        this.nextNodeId = nextNodeId == null ? null : nextNodeId.trim();
    }

    /**
     * ��ȡ��һ�ڵ㴦����
     *
     * @return NEXT_USER_ID - ��һ�ڵ㴦����
     */
    public String getNextUserId() {
        return nextUserId;
    }

    /**
     * ������һ�ڵ㴦����
     *
     * @param nextUserId ��һ�ڵ㴦����
     */
    public void setNextUserId(String nextUserId) {
        this.nextUserId = nextUserId == null ? null : nextUserId.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        NWfNodeDone other = (NWfNodeDone) that;
        return (this.getInstanceId() == null ? other.getInstanceId() == null : this.getInstanceId().equals(other.getInstanceId()))
            && (this.getNodeId() == null ? other.getNodeId() == null : this.getNodeId().equals(other.getNodeId()))
            && (this.getNodeSign() == null ? other.getNodeSign() == null : this.getNodeSign().equals(other.getNodeSign()))
            && (this.getNodeName() == null ? other.getNodeName() == null : this.getNodeName().equals(other.getNodeName()))
            && (this.getNodeState() == null ? other.getNodeState() == null : this.getNodeState().equals(other.getNodeState()))
            && (this.getStartTime() == null ? other.getStartTime() == null : this.getStartTime().equals(other.getStartTime()))
            && (this.getEndTime() == null ? other.getEndTime() == null : this.getEndTime().equals(other.getEndTime()))
            && (this.getOrgId() == null ? other.getOrgId() == null : this.getOrgId().equals(other.getOrgId()))
            && (this.getLastNodeId() == null ? other.getLastNodeId() == null : this.getLastNodeId().equals(other.getLastNodeId()))
            && (this.getLastNodeName() == null ? other.getLastNodeName() == null : this.getLastNodeName().equals(other.getLastNodeName()))
            && (this.getNodeLevelTotal() == null ? other.getNodeLevelTotal() == null : this.getNodeLevelTotal().equals(other.getNodeLevelTotal()))
            && (this.getNodeType() == null ? other.getNodeType() == null : this.getNodeType().equals(other.getNodeType()))
            && (this.getNextNodeId() == null ? other.getNextNodeId() == null : this.getNextNodeId().equals(other.getNextNodeId()))
            && (this.getNextUserId() == null ? other.getNextUserId() == null : this.getNextUserId().equals(other.getNextUserId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        result = prime * result + ((getNodeId() == null) ? 0 : getNodeId().hashCode());
        result = prime * result + ((getNodeSign() == null) ? 0 : getNodeSign().hashCode());
        result = prime * result + ((getNodeName() == null) ? 0 : getNodeName().hashCode());
        result = prime * result + ((getNodeState() == null) ? 0 : getNodeState().hashCode());
        result = prime * result + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        result = prime * result + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        result = prime * result + ((getOrgId() == null) ? 0 : getOrgId().hashCode());
        result = prime * result + ((getLastNodeId() == null) ? 0 : getLastNodeId().hashCode());
        result = prime * result + ((getLastNodeName() == null) ? 0 : getLastNodeName().hashCode());
        result = prime * result + ((getNodeLevelTotal() == null) ? 0 : getNodeLevelTotal().hashCode());
        result = prime * result + ((getNodeType() == null) ? 0 : getNodeType().hashCode());
        result = prime * result + ((getNextNodeId() == null) ? 0 : getNextNodeId().hashCode());
        result = prime * result + ((getNextUserId() == null) ? 0 : getNextUserId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", instanceId=").append(instanceId);
        sb.append(", nodeId=").append(nodeId);
        sb.append(", nodeSign=").append(nodeSign);
        sb.append(", nodeName=").append(nodeName);
        sb.append(", nodeState=").append(nodeState);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", orgId=").append(orgId);
        sb.append(", lastNodeId=").append(lastNodeId);
        sb.append(", lastNodeName=").append(lastNodeName);
        sb.append(", nodeLevelTotal=").append(nodeLevelTotal);
        sb.append(", nodeType=").append(nodeType);
        sb.append(", nextNodeId=").append(nextNodeId);
        sb.append(", nextUserId=").append(nextUserId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}