"use strict";(self["webpackChunkseeingflow_webapp"]=self["webpackChunkseeingflow_webapp"]||[]).push([[565],{8304:function(e,l,a){a.d(l,{ZP:function(){return q},TF:function(){return W},a2:function(){return C},md:function(){return x},_q:function(){return S}});var t=a(9003),o=a(1109),u=a(3513),n=a(6624),i=a(4419),r=a(678);const d=Symbol("sfTableInjectKey");function s(e){return"function"===typeof e||"[object Object]"===Object.prototype.toString.call(e)&&!(0,t.lA)(e)}var c=(0,t.aZ)({setup(e,{slots:l}){const a=(0,t.f3)(d),o=(0,t.Fl)((()=>a?.tableColumns.value?.filter((e=>{const l=e.filterable?.queryField||e.dataIndex||e.slotName,t=e.dataIndex||e.slotName;return void 0!==e.filterable&&("string"===(0,u.Eq)(l)&&""!==l&&(!!a.displayColumnKeys.value.some((e=>e===t))||(a?.queryData.value&&a.queryData.value[l]!==(e.filterable?.defaultValue||void 0)&&(a.queryData.value[l]=e.filterable?.defaultValue||void 0),!1)))})).slice().sort(((e,l)=>{const a=e.filterable?.sort||0,t=l.filterable?.sort||0;return a-t})).map((e=>{const a=e.filterable,o=a.queryField||e.dataIndex||e.slotName;let u;switch(a.type){case"checkbox":u=e=>(0,t.Wm)((0,t.up)("a-checkbox-group"),{modelValue:e[o],"onUpdate:modelValue":l=>e[o]=l,type:"button"},{default:()=>[a.filters?.map((e=>(0,t.Wm)((0,t.up)("a-checkbox"),{value:e.value},{default:()=>[e.text]})))]});break;case"radio":u=e=>(0,t.Wm)((0,t.up)("a-radio-group"),{modelValue:e[o],"onUpdate:modelValue":l=>e[o]=l,type:"button"},{default:()=>[a.filters?.map((e=>(0,t.Wm)((0,t.up)("a-radio"),{value:e.value},{default:()=>[e.text]})))]});break;case"select":u=e=>(0,t.Wm)((0,t.up)("a-select"),{placeholder:"选择",modelValue:e[o],"onUpdate:modelValue":l=>e[o]=l,onClear:()=>e[o]=void 0,"allow-clear":!0},{default:()=>[a.filters?.map((e=>(0,t.Wm)((0,t.up)("a-option"),{value:e.value},{default:()=>[e.text]})))]});break;case"search":u=e=>(0,t.Wm)((0,t.up)("a-input"),{"max-length":50,placeholder:"搜索",modelValue:e[o],"onUpdate:modelValue":l=>e[o]=l,onClear:()=>e[o]=void 0,"allow-clear":!0},null);break;case"range-picker":u=e=>(0,t.Wm)((0,t.up)("a-range-picker"),{showConfirmBtn:!1,modelValue:e[o],"onUpdate:modelValue":l=>e[o]=l},null);break;case"range-picker-time":u=e=>(0,t.Wm)((0,t.up)("a-range-picker"),{showTime:!0,showConfirmBtn:!1,modelValue:e[o],"onUpdate:modelValue":l=>e[o]=l},null);break;case"slot":u=e=>l[a.slotName]?.({queryData:e});break}return{...e,filterable:{...e.filterable,render:u}}})))),n=(0,t.Fl)((()=>{const e={};return o.value?.forEach((l=>{void 0!==e[l.filterable?.group||99]?e[l.filterable?.group||99].push(l):e[l.filterable?.group||99]=[l]})),Object.keys(e).sort(((e,l)=>Number(e)-Number(l))).map((l=>e[Number(l)]))})),i=a?.queryData.value,r=(0,t.Fl)((()=>o.value?.map((e=>{const l=e.filterable?.queryField||e.dataIndex||e.slotName;return!!l&&(!!i[l]&&i[l]!==e.filterable?.defaultValue)})).reduce(((e,l)=>e||l),!1))),c=()=>{a?.tableColumns.value?.forEach((e=>{const l=e.filterable?.queryField||e.dataIndex||e.slotName;a?.queryData.value&&a.queryData.value[l]!==(e.filterable?.defaultValue||void 0)&&(a.queryData.value[l]=e.filterable?.defaultValue||void 0)}))};return()=>(0,t.Wm)((0,t.up)("a-form"),{model:a.queryData.value,layout:"inline"},{default:()=>[l["filter-pre-extra"]?.({formItemAttr:{"label-col-style":{"min-width":"100px"},style:{width:"100%","max-width":"330px"}}}),n.value.map(((e,l)=>(0,t.Wm)("div",{style:"display: inline-flex; flex-wrap: wrap; width: 100%;"},[e?.map((e=>{let l;const a=e.filterable,o=a.queryField||e.dataIndex||e.slotName;return(0,t.Wm)((0,t.up)("a-form-item"),{"label-col-style":{"min-width":"100px"},style:{width:"100%","max-width":354*(a.ratio||1)-24+"px"},label:a?.label||e.title,field:o},s(l=a.render(i))?l:{default:()=>[l]})})),l===n.value.length-1&&r.value?(0,t.Wm)((0,t.up)("a-form-item"),{"label-col-style":{"min-width":"100px"},style:{width:"100%","max-width":"330px"}},{default:()=>[(0,t.Wm)((0,t.up)("a-button"),{type:"outline",onClick:c},{default:()=>[(0,t.Uk)("清除筛选条件")]})]}):null]))),l["filter-after-extra"]?.()]})}}),p=(0,t.aZ)({setup(e,{slots:l}){const a=(0,t.f3)(d);return()=>(0,t.Wm)("div",null,[(0,t.Wm)((0,t.up)("a-space"),null,{default:()=>[l["options"]?.()]}),(0,t.Wm)((0,t.up)("a-divider"),{direction:"vertical"},null),(0,t.Wm)((0,t.up)("a-space"),null,{default:()=>[l["tools-options"]?.(),(0,t.Wm)((0,t.up)("a-tooltip"),{content:"刷新"},{default:()=>[(0,t.Wm)((0,t.up)("a-button"),{shape:"circle",onClick:()=>a?.loadData()},{default:()=>[(0,t.Wm)((0,t.up)("icon-sync"),null,null)]})]})]})])}}),m=(0,t.aZ)({setup(e,{slots:l}){const a=(0,t.f3)(d);return()=>(0,t.Wm)((0,t.up)("a-space"),null,{default:()=>[l["selected-options"]?.(),a?.isSelected.value?(0,t.Wm)((0,t.up)("a-tag"),{size:"large",closable:!0,onClose:()=>a?.onRowSelect([])},{default:()=>[(0,t.Uk)("已选择 "),a?.rowSelection.value?.selectedRowKeys?.length,(0,t.Uk)(" 条数据")]}):(0,t.Wm)(t.HY,null,null)]})}});function f(e){return"function"===typeof e||"[object Object]"===Object.prototype.toString.call(e)&&!(0,t.lA)(e)}var v=(0,t.aZ)({emits:["rowClick"],setup(e,{emit:l,slots:a}){const o=(0,t.f3)(d),n=e=>{o?.pagination.value&&(o.pagination.value.current=e)},i=e=>{o?.pagination.value&&(o.pagination.value.pageSize=e)};let r=!1,s=!1,c=!1;const p=()=>{s=!0,r=!1,c=!0},m=()=>{r=!0},v=e=>{!0===s&&0==r&&!0===c&&setTimeout((()=>{l("rowClick",e)}),50)};return()=>(0,t.Wm)((0,t.up)("a-table"),{bordered:{headerCell:!0,wrapper:!1},"table-layout-fixed":!0,"filter-icon-align-left":!1,scroll:o?.scroll.value,"sticky-header":.1,columns:o?.displayTableColumns.value.map((e=>{const l=(0,u.I8)(e);return delete l.filterable,l})),data:o?.tableData.value,pagination:o?.pagination.value,"row-selection":o?.rowSelection.value,loading:o?.tableLoading.value,onRowClick:v,onSelectAll:o?.onSelectAll,onSelect:o?.onRowSelect,onPageChange:n,onPageSizeChange:i,onMousedown:p,onMousemove:m},f(a)?a:{default:()=>[a]})}});function y(e){return"function"===typeof e||"[object Object]"===Object.prototype.toString.call(e)&&!(0,t.lA)(e)}const b=e=>{const l=(0,t.iH)({total:0,current:1,pageSize:20,showPageSize:!0});return!1!==e.value?l.value={...l.value,...e.value}:l.value=!1,{pagination:l}},w=(e,l,a)=>{const o=(0,t.iH)(!1),u=(0,t.iH)(!1),n=(0,t.iH)({type:"checkbox",width:25,onlyCurrent:!1});!1!==e.value?n.value={...n.value,...e.value}:n.value=void 0;const i=e=>{void 0!==n.value&&(o.value=e,a?.("selectAll",e),e?n.value.selectedRowKeys?.length?n.value.selectedRowKeys.push(...l.value?.filter((e=>!0!==e.disabled)).map((e=>e.key))):n.value.selectedRowKeys=l.value?.filter((e=>!0!==e.disabled)).map((e=>e.key)):n.value.selectedRowKeys=n.value.selectedRowKeys?.filter((e=>!l.value?.filter((e=>!0!==e.disabled)).map((e=>e.key)).some((l=>e===l)))))},r=e=>{void 0!==n.value&&(n.value.selectedRowKeys=e)};return void 0!==n.value&&(0,t.YP)((()=>n.value.selectedRowKeys),(()=>{n.value.selectedRowKeys&&n.value.selectedRowKeys?.length?u.value=!0:u.value=!1,a?.("select",n.value.selectedRowKeys)})),{rowSelection:n,isSelected:u,onSelectAll:i,onRowSelect:r}},h=(e,l)=>{const a=(0,t.iH)(e.value||[]);(0,t.YP)(e,(()=>{a.value=e.value})),(0,t.m0)((()=>{e.value?.length||(l.value?a.value=l.value.map((e=>e.dataIndex||e.slotName)):a.value=[])}));const o=(0,t.Fl)((()=>a.value?.length&&l.value?.filter((e=>a.value.some((l=>e.dataIndex===l||e.slotName===l))))||[]));return{displayColumnKeys:a,displayTableColumns:o}},g=(e,l,a,o,u)=>{const n=(0,t.iH)(!1),i=(l=!0)=>(n.value=!0===l,u(!1===e.value?0:e.value.current,!1===e.value?0:e.value.pageSize,a.value).then((l=>(e.value&&(e.value.total=l.total),o.value=l,l))).finally((()=>{n.value=!1})));!1!==e.value&&((0,t.YP)((()=>e.value.current),(()=>i())),(0,t.YP)((()=>e.value.pageSize),(()=>i())));let r=null;return(0,t.bv)((()=>{i(),(0,t.YP)(a,(()=>{(0,t.Y3)((()=>{e.value&&(e.value.current=1),l.value&&(l.value.selectedRowKeys=[]),null!==r&&(clearTimeout(r),r=null),n.value=!0,r=setTimeout(i,500)}))}),{deep:!0})})),{tableLoading:n,loadData:i}};var k=(0,t.aZ)({props:{tableColumns:{type:Array},displayColumnKeys:{type:Array,default:()=>[]},queryData:{type:Object},defaultPagination:{type:[Boolean,Object],default:()=>({current:1,pageSize:20})},defaultRowSelection:{type:[Boolean,Object],default:()=>!1},scroll:{type:Object},loadData:{type:Function,required:!0},formatLoadData:{type:Function,required:!0}},emits:["select","selectAll","rowClick"],setup(e,{emit:l,slots:a}){const{defaultPagination:o,defaultRowSelection:u,scroll:n,displayColumnKeys:i,queryData:r,tableColumns:s}=(0,t.BK)(e),f=(0,t.iH)(),k=e.formatLoadData(f),{pagination:x}=b(o),{rowSelection:W,isSelected:C,onSelectAll:S,onRowSelect:D}=w(u,k,l),{displayTableColumns:q,displayColumnKeys:R}=h(i,s),{tableLoading:K,loadData:j}=g(x,W,r,f,e.loadData);(0,t.JJ)(d,{tableLoading:K,tableData:k,tableColumns:s,rowSelection:W,scroll:n,displayTableColumns:q,displayColumnKeys:R,queryData:r,pagination:x,isSelected:C,onSelectAll:S,onRowSelect:D,loadData:j});const T={},F={};return(0,t.m0)((()=>{Object.keys(a).filter((e=>/^table-/.test(e))).forEach((e=>T[e]=a[e])),Object.keys(a).filter((e=>/^filter-/.test(e))).forEach((e=>F[e]=a[e]))})),{tableData:k,pagination:x,isSelected:C,rowSelection:W,sfLoadData:j,theRender:()=>(0,t.Wm)("div",{class:"sf-talbe"},[(0,t.Wm)((0,t.up)("a-space"),{direction:"vertical",fill:!0},{default:()=>[(0,t.Wm)(c,null,y(F)?F:{default:()=>[F]}),(0,t.Wm)((0,t.up)("a-row"),{justify:"space-between"},{default:()=>[(0,t.Wm)(m,null,{"selected-options":a["selected-options"]}),(0,t.Wm)(p,null,{options:a["options"],"tools-options":a["tools-options"]})]}),(0,t.Wm)(v,{onRowClick:e=>l("rowClick",e)},y(T)?T:{default:()=>[T]})]})])}},render(){return this.theRender()}});function x(e,l=!0){const a=(0,t.qj)({}),o=(0,r.yj)(),n=(0,u.I8)(o.query);return(0,t.m0)((()=>{e.value.forEach((e=>{const t=e.filterable?.queryField||e.dataIndex||e.slotName,o=e.filterable?.defaultValue;a[t]=l&&n[t]||o}))})),{queryData:a}}function W(e){const l=(0,t.Fl)((()=>{const l={};return Object.keys(e).forEach((a=>{"-999"!==e[a]&&-999!==e[a]&&""!==e[a]&&null!==e[a]&&void 0!==e[a]&&(l[a]=e[a])})),l}));return{fQueryData:l}}function C(e){const l=l=>(0,t.Fl)((()=>l.value?l.value?.list?.map(e).map(((e,a)=>({createdTime:e.data.createdTime,updatedTime:e.data.updatedTime,updatedBy:e.data.updatedBy,createdBy:e.data.createdBy,NO:((l.value.current||1)-1)*(l.value.size||0)+a+1,...e}))):[]));return{formatLoadData:l}}function S(e,l=["NO","updatedBy","updatedTime"]){const a=()=>({ellipsis:!0,tooltip:!0,width:100}),o=()=>({ellipsis:!0,tooltip:!0,width:180}),u=(0,t.Fl)((()=>{const t=[];l.some((e=>"NO"===e))&&t.push({dataIndex:"NO",title:"序号",width:70,ellipsis:!0,tooltip:!0});const u=e.value.findIndex((e=>"table-operation"===e.slotName));-1===u?t.push(...e.value):t.push(...e.value.slice(0,u),...e.value.slice(u+1));const n={};return e.value.forEach((e=>{n[e.dataIndex||e.slotName]=!0})),l.some((e=>"createdBy"===e))&&!n["createdBy"]&&t.push({title:"创建人",dataIndex:"createdBy",...a()}),l.some((e=>"createdTime"===e))&&!n["createdTime"]&&t.push({title:"创建时间",dataIndex:"createdTime",...o()}),l.some((e=>"updatedBy"===e))&&!n["updatedBy"]&&t.push({title:"操作人",dataIndex:"updatedBy",...a()}),l.some((e=>"updatedTime"===e))&&!n["updatedTime"]&&t.push({title:"操作时间",dataIndex:"updatedTime",...o()}),-1!==u&&t.push(e.value[u]),t}));return{tableColumns:u}}function D(e,l,a){const o=(0,t.Fl)((()=>e.value?.map((e=>({label:e.title,value:e.dataIndex||e.slotName}))))),n=(0,r.yj)(),i=(0,t.iH)(JSON.parse(localStorage.getItem(`CustomDisplayColumns_${n.path}`)||"[]"));l?.length&&(i.value=(0,u.I8)(l));const d=(0,t.iH)(0),s=(0,t.iH)({});(0,t.m0)((()=>{i.value.length||(i.value=e.value.map((e=>e.dataIndex||e.slotName))),d.value=e.value.map((e=>e.width||0)).reduce(((e,l)=>e+l),0),s.value={},e.value.forEach((e=>{s.value[e.dataIndex||e.slotName]=e}))})),(0,t.bv)((()=>{(0,t.YP)(i,(()=>{localStorage.setItem(`CustomDisplayColumns_${n.path}`,JSON.stringify(i.value))}))}));const c=(0,t.Fl)((()=>i.value.length!==e.value.length)),p=(0,t.Fl)((()=>{if(a.value?.x){const e=i.value.map((e=>s.value[e].width||0)).reduce(((e,l)=>e+l),0),l=d.value-e;return{x:a.value.x-l,y:a.value?.y}}return{x:a.value?.x,y:a.value?.y}})),m=()=>(0,t.Wm)((0,t.up)("a-trigger"),{trigger:"click","unmount-on-close":!1},{default:()=>(0,t.Wm)((0,t.up)("a-tooltip"),{content:"表格工具"},{default:()=>[(0,t.Wm)((0,t.up)("a-button"),{shape:"circle",type:c.value?"outline":void 0},{default:()=>[(0,t.Wm)((0,t.up)("icon-tool"),null,null)]})]}),content:()=>(0,t.Wm)("div",{style:"background-color: var(--color-bg-popup); border: 1px solid var(--color-fill-3);border-radius: var(--border-radius-medium);box-shadow: 0 4px 10px rgb(0 0 0 / 10%); padding: 6px 16px 6px 12px;"},[(0,t.Wm)((0,t.up)("a-checkbox-group"),{direction:"vertical",modelValue:i.value,"onUpdate:modelValue":e=>i.value=e,options:o.value},null)])});return{displayColumnKeys:i,scroll:p,TableTools:m}}var q=(0,t.aZ)({props:{tableColumns:{type:Array,required:!0},defaultShowColumn:{type:Array},queryData:{type:Object},defaultPagination:{type:[Boolean,Object],default:()=>({current:1,pageSize:20})},defaultRowSelection:{type:[Boolean,Object],default:()=>!1},scroll:{type:Object,default:()=>({x:1400})},operation:{type:Array,default:()=>["view","edit","delete"]},loadData:{type:Function,required:!0},formatLoadData:{type:Function,required:!0},asyncToRouteQuery:{type:Boolean,default:()=>!0},del:{type:[Function,Boolean],default:()=>!1},rowView:{type:[Function,Boolean],default:()=>!0},rowEdit:{type:[Function,Boolean],default:()=>!0},rowDelete:{type:[Function,Boolean],default:()=>!0},rowClick:{type:[Function,Boolean],default:()=>!0},clickAdd:{type:[Function,Boolean],default:()=>!0},addText:{type:String,default:()=>"添加"}},setup(e,{slots:l,emit:a}){const u=(0,t.iH)(),d=(0,t.Fl)((()=>u.value?.isSelected)),s=(0,t.Fl)((()=>{const l=[...e.tableColumns],a=e.tableColumns.findIndex((e=>"table-operation"===e.slotName));return-1!==a&&e.operation?.length||e.operation?.length&&l.push({title:"操作",slotName:"table-operation",width:62*e.operation.length+32}),l})),{scroll:c}=(0,i.BK)(e),{displayColumnKeys:p,scroll:m,TableTools:f}=D(s,e.defaultShowColumn,c),v=(0,r.tv)(),y=(0,r.yj)(),{fQueryData:b}=W(e.queryData),w=(l,a,t)=>{if(e.asyncToRouteQuery){const e={current:l,pageSize:a,...b.value};v.replace({query:e})}return e.loadData(l,a,t)},h=(0,t.iH)(!1);!1!==e.defaultPagination&&(h.value={...e.defaultPagination,current:y.query?.current?Number(y.query.current):1,pageSize:y.query?.pageSize?Number(y.query.pageSize):20});const g=(0,t.iH)({type:"checkbox",showCheckedAll:!0,width:25,selectedRowKeys:[],onlyCurrent:!1});!1!==e.defaultRowSelection?g.value={...g.value,...e.defaultRowSelection}:g.value=!1;const x=e=>{!1!==g.value&&(g.value.selectedRowKeys=e,a("select",e))},C=()=>new Promise(((e,l)=>{n.Z.warning({title:"删除",content:"确定删除吗？",closable:!0,cancelText:"取消",hideCancel:!1,onOk:()=>{e(!0)},onCancel:()=>{l(!1)}})})),S=()=>{e.del&&g.value&&g.value.selectedRowKeys?.length&&C().then((()=>{const l=o.Z.delayLoading("删除中...",1e3);e.del&&e.del(g.value.selectedRowKeys).finally((()=>{u.value&&(u.value.sfLoadData(),u.value.rowSelection.selectedrowKeys=[]),l()})),a("delete",g.value.selectedRowKeys)})).catch((()=>{}))},q=l=>{"function"===typeof e.rowView?e.rowView(l):v.push({name:y.name+"Detail",params:{model:"View",id:l.key}})},R=l=>{"function"===typeof e.rowEdit?e.rowEdit(l):v.push({name:y.name+"Detail",params:{model:"Edit",id:l.key}})},K=l=>C().then((()=>{if(l?.key&&"function"===typeof e.rowDelete){const a=o.Z.delayLoading("删除中...",1e3);return e.rowDelete?.(l.key).then((()=>{u.value.sfLoadData(),u.value.rowSelection.selectedrowKeys=[]})).finally((()=>{a()}))}})),j=l=>{"function"===typeof e.rowClick?e.rowClick(l):!1!==e.rowClick&&v.push({name:y.name+"Detail",params:{model:"View",id:l.key}})},T=()=>{"function"===typeof e.clickAdd?e.clickAdd():v.push({name:y.name+"Detail",params:{model:"Add"}})},F=({record:a})=>(0,t.Wm)(t.HY,null,[e.operation?.some((e=>"view"===e))?(0,t.Wm)((0,t.up)("a-link"),{style:"padding: 4px 8px;",onClick:()=>q(a)},{default:()=>(0,t.Wm)(t.HY,null,[(0,t.Uk)("详情")]),icon:()=>(0,t.Wm)((0,t.up)("icon-eye"),null,null)}):null,e.operation?.some((e=>"edit"===e))?(0,t.Wm)((0,t.up)("a-link"),{style:"padding: 4px 8px;",onClick:()=>R(a)},{default:()=>(0,t.Wm)(t.HY,null,[(0,t.Uk)("编辑")]),icon:()=>(0,t.Wm)((0,t.up)("icon-edit"),null,null)}):null,e.operation?.some((e=>"delete"===e))?(0,t.Wm)((0,t.up)("a-link"),{style:"padding: 4px 8px;",status:"danger",onClick:()=>K(a)},{default:()=>(0,t.Wm)(t.HY,null,[(0,t.Uk)("删除")]),icon:()=>(0,t.Wm)((0,t.up)("icon-delete"),null,null)}):null,e.operation?.filter((e=>"view"!==e&&"edit"!==e&&"delete"!==e)).map((e=>l[e]?.({record:a,defaultAttr:{style:"padding: 4px 8px;"}})))]);return{reLoadData:()=>u.value?.sfLoadData(),theRender:()=>(0,t.Wm)("div",{class:"sf-table-page container"},[l["breadcrumb"]?.(),(0,t.Wm)((0,t.up)("a-card"),null,{default:()=>[(0,t.Wm)(k,{class:"sf-table",ref:u,tableColumns:s.value,displayColumnKeys:p.value,queryData:e.queryData,defaultPagination:h.value,defaultRowSelection:g.value,scroll:m.value,loadData:w,formatLoadData:e.formatLoadData,onSelect:x,onRowClick:j},{...l,"selected-options":()=>(0,t.Wm)("span",null,[e.del&&(0,t.Wm)((0,t.up)("a-tooltip"),{content:"删除"},{default:()=>[(0,t.Wm)((0,t.up)("a-button"),{status:"danger",onClick:S,disabled:!1===d.value},{icon:()=>(0,t.Wm)((0,t.up)("icon-delete"),null,null)})]}),l["selected-options"]?.()]),options:()=>(0,t.Wm)("span",null,[l["options"]?.(),!1!==e.clickAdd&&(0,t.Wm)((0,t.up)("a-button"),{type:"primary",onClick:T},{default:()=>e.addText,icon:()=>(0,t.Wm)((0,t.up)("icon-plus"),null,null)})]),"tools-options":()=>l["tools-options"]?(0,t.Wm)(t.HY,null,[l["tools-options"]?.(),(0,t.Wm)(f,null,null)]):(0,t.Wm)(f,null,null),"table-operation":F})]})])}},render(){return this.theRender()}})},4880:function(e,l,a){a.d(l,{Z:function(){return d}});var t=a(9003),o=a(678);function u(e){return"function"===typeof e||"[object Object]"===Object.prototype.toString.call(e)&&!(0,t.lA)(e)}var n=(0,t.aZ)({name:"BreadcrumbComponent",props:{items:{type:Array,default:()=>[]}},setup(e){(0,o.tv)();const{items:l}=(0,t.BK)(e);return()=>(0,t.Wm)((0,t.up)("a-breadcrumb"),{class:"container-breadcrumb"},{default:()=>[(0,t.Wm)((0,t.up)("a-breadcrumb-item"),null,{default:()=>[(0,t.Wm)((0,t.up)("icon-apps"),null,null)]}),l.value.map(((e,l)=>"string"==typeof e?(0,t.Wm)((0,t.up)("a-breadcrumb-item"),{key:l},u(e)?e:{default:()=>[e]}):(0,t.Wm)((0,t.up)("a-breadcrumb-item"),{key:l,onClick:()=>e.router(),class:"breadcrumb-clickable"},{default:()=>[e.name]})))]})}}),i=a(89);const r=(0,i.Z)(n,[["__scopeId","data-v-0dac1d28"]]);var d=r}}]);